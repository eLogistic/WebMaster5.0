package com.webmasters50.eLogistic;

public class MovimientoDinero {
    //Atributos
    private String usuarioEncargado;
    private String conceptoMovimiento;
    private double montoMovimiento;
    //Constructor

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
