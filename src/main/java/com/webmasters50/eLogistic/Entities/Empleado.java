package com.webmasters50.eLogistic.Entities;

public class Empleado {

    //Atributos
    private String nombre;
    private String correo;
    private String empresa;
    private String rol;

    MovimientoDinero movimiento1;
    //Constructor
    public Empleado(String nombre, String correo, String empresa, String rol, MovimientoDinero movimiento1) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
        this.movimiento1 = movimiento1;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public MovimientoDinero getMovimiento1() {
        return movimiento1;
    }

    public void setMovimiento1(MovimientoDinero movimiento1) {
        this.movimiento1 = movimiento1;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", empresa='" + empresa + '\'' +
                ", rol='" + rol + '\'' +
                ", movimiento1=" + this.movimiento1 +
                '}';
    }
}
