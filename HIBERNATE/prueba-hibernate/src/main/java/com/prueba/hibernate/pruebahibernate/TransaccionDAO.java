package com.prueba.hibernate.pruebahibernate;

public interface TransaccionDAO {
    void registrarTransaccion(Transaccion transaccion);
    Transaccion modificarTransaccion(Transaccion transaccion);
}