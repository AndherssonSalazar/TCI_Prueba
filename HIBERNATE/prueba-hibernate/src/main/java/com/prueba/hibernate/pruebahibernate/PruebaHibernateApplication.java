package com.prueba.hibernate.pruebahibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;

@SpringBootApplication
public class PruebaHibernateApplication {
	public static void main(String[] args) {
		//SpringApplication.run(PruebaHibernateApplication.class, args);
		// Configurar la sesión de Hibernate
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// Crear una instancia de TransaccionDao
		TransaccionDAO transaccionDao = new TransaccionDAOImpl();
		((TransaccionDAOImpl) transaccionDao).setSessionFactory(sessionFactory);

		// Crear una nueva transacción
		Transaccion nuevaTransaccion = new Transaccion();
		nuevaTransaccion.setNombreDocumento("Documento de prueba");
		nuevaTransaccion.setFechaRegistro(new Date()); // Asegúrate de importar java.util.Date
		nuevaTransaccion.setEstado("Pendiente");

		// Registrar la nueva transacción
		transaccionDao.registrarTransaccion(nuevaTransaccion);
		System.out.println("Transacción registrada con éxito. ID: " + nuevaTransaccion.getIdTransaccion());

		// Modificar la transacción
		nuevaTransaccion.setEstado("Completado");
		transaccionDao.modificarTransaccion(nuevaTransaccion);
		System.out.println("Transacción modificada con éxito.");

		// Cerrar la sesión de Hibernate
		sessionFactory.close();

	}
}
