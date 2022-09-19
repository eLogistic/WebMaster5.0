package com.webmasters50.eLogistic.entidades;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="empresa")
public class Empresa {

    //Atributos
    @Id
    private Long nitEmpresa;


    /*
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

     */
    @Column(name="nombreEmpresa")
    private String nombreEmpresa;
    @Column(name="direccionEmpresa")
    private String direccionEmpresa;
    @Column(name="telefonoEmpresa")
    private Integer telefonoEmpresa;


    //se adiciona un nuevo atributo de la clase MovimientoDinero para crear la relacion de entidad

    @OneToMany(mappedBy = "empresas")
    private Set<MovimientoDinero> movimientos;

    //Constructor

    public Empresa(){

    }

/*
    public Empresa(String nombreEmpresa, String direccionEmpresa, Integer telefonoEmpresa, Integer nitEmpresa, MovimientoDinero movimientos) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nitEmpresa = nitEmpresa;
        this.movimientos = movimientos;
    }

 */

    //Getters and Setters

    public Set<MovimientoDinero> getMovimientos() {
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
    public Long getNitEmpresa() {
        return nitEmpresa;
    }
    public void setNitEmpresa(Long nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }
    public void setMovimientos(Set<MovimientoDinero> movimientos) {
        this.movimientos = movimientos;
    }

    /*
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

     */
}
