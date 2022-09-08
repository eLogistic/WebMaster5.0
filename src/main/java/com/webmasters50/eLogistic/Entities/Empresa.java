package com.webmasters50.eLogistic.Entities;

public class Empresa {

    //Atributos
    private String nombreEmpresa;
    private String direccionEmpresa;
    private Integer telefonoEmpresa;
    private Integer nitEmpresa;

    Empleado empleado1;
    //Constructor
    public Empresa(String nombreEmpresa, String direccionEmpresa, Integer telefonoEmpresa, Integer nitEmpresa, Empleado empleado1) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nitEmpresa = nitEmpresa;
        this.empleado1 = empleado1;
    }

    //Getters and Setters
    public String getNombreEmpresa() {return nombreEmpresa;}
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

    public Empleado getEmpleado1() {return empleado1;}
    public void setEmpleado1(Empleado empleado1) {this.empleado1 = empleado1;}

    @Override
    public String toString() {
        return "Empresa{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", direccionEmpresa='" + direccionEmpresa + '\'' +
                ", telefonoEmpresa=" + telefonoEmpresa +
                ", nitEmpresa=" + nitEmpresa +
                ", empleado1=" + this.empleado1 +
                '}';
    }
}
