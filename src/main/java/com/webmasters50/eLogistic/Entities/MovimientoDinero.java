package com.webmasters50.eLogistic.Entities;

import javax.persistence.*;

@Entity
@Table(name = "movimientodinero")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //Atributos
    @Column(name ="usuarioEncargado")
    private String usuarioEncargado;
    @Column(name ="conceptoMovimiento")
    private String conceptoMovimiento;
    @Column(name ="montoMovimiento")
    private double montoMovimiento;
    //Constructor
    public MovimientoDinero(){

    }

    public MovimientoDinero(String usuarioEncargado, String conceptoMovimiento, double montoMovimiento) {
        this.usuarioEncargado = usuarioEncargado;
        this.conceptoMovimiento = conceptoMovimiento;
        this.montoMovimiento = montoMovimiento;
    }

    //Método

    //Getters y Setters

    public String getUsuarioEncargado() {
        return usuarioEncargado;
    }

    public void setUsuarioEncargado(String usuarioEncargado) {
        this.usuarioEncargado = usuarioEncargado;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }
}
