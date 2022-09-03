package com.webmasters50.eLogistic.entidades;

public class Empresa {

    //Atributos
    private String nombreEmpresa;
    private String direccionEmpresa;
    private Integer telefonoEmpresa;
    private Integer nitEmpresa;

    //se adiciona un nuevo atributo de la clase MovimientoDinero para crear la relacion de entidad

    private MovimientoDinero movimientos;

    //Constructor


    public Empresa(String nombreEmpresa, String direccionEmpresa, Integer telefonoEmpresa, Integer nitEmpresa, MovimientoDinero movimientos) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nitEmpresa = nitEmpresa;
        this.movimientos = movimientos;
    }

    //Getters and Setters

    public MovimientoDinero getMovimientos() {
        return movimientos;
    }
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }
    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }
    public Integer getTelefonoEmpresa() {
        return telefonoEmpresa;
    }
    public void setTelefonoEmpresa(Integer telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }
    public Integer getNitEmpresa() {
        return nitEmpresa;
    }
    public void setNitEmpresa(Integer nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }
    public void setMovimientos(MovimientoDinero movimientos) {
        this.movimientos = movimientos;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", direccionEmpresa='" + direccionEmpresa + '\'' +
                ", telefonoEmpresa=" + telefonoEmpresa +
                ", nitEmpresa=" + nitEmpresa +
                ", movimientos=" + movimientos +
                '}';
    }
}
