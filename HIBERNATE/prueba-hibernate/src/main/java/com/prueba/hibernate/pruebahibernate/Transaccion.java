package com.prueba.hibernate.pruebahibernate;
import java.util.Date;

public class Transaccion {
    private int idTransaccion;
    private String nombreDocumento;
    private Date fechaRegistro;
    private String estado;

    //Constructor vacío
    public Transaccion() {}

    //Constructor con todos los atributos
    public Transaccion(int idTransaccion, String nombreDocumento, Date fechaRegistro, String estado) {
        this.idTransaccion = idTransaccion;
        this.nombreDocumento = nombreDocumento;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
    }

    //Getters y Setters
    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}