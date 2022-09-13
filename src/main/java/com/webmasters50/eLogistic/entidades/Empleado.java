package com.webmasters50.eLogistic.entidades;

import javax.persistence.*;

@Entity
@Table(name="empleado")
public class Empleado {

    //Atributos
/*
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
   */
    @Id
    private Long identificacion;

    @Column(name="nombre")
    private String nombre;
    @Column(name="correo")
    private String correo;
    @Column(name="empresa")
    private String empresa;
    @Column(name="rol")
    private String rol;

    //se adiciona un nuevo atributo de la clase empresa para crear la relacion de entidad
    @ManyToOne(optional = true)
    @JoinColumn(name = "nitEmpresa")
    private Empresa empresas;

    //Constructor

    public Empleado(){

    }
/*
    public Empleado(String nombre, String correo, String empresa, String rol, Empresa empresas) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
        this.empresas = empresas;
    }
 */

    //Getters and Setters


    public Long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Long identificacion) {
        this.identificacion = identificacion;
    }

    public Empresa getEmpresas() {
        return empresas;
    }

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

    public void setEmpresas(Empresa empresas) {
        this.empresas = empresas;
    }
/*
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", empresa='" + empresa + '\'' +
                ", rol='" + rol + '\'' +
                ", empresas=" + empresas +
                '}';
    }

 */

}
