package com.webmasters50.eLogistic.entidades;


import javax.persistence.*;

@Entity
@Table(name="movimientodinero")
public class MovimientoDinero {


    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long registroMovimiento;
    /*
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    */
    @Column(name="usuarioEncargado")
    private String usuarioEncargado;
    @Column(name="conceptoMovimiento")
    private String conceptoMovimiento;
    @Column(name="montoMovimiento")
    private double montoMovimiento;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nitEmpresa", nullable = false)
    private Empresa empresas;
    //Constructor

    public MovimientoDinero() {
    }
    /*
    public MovimientoDinero(String usuarioEncargado, String conceptoMovimiento, double montoMovimiento) {
        this.usuarioEncargado = usuarioEncargado;
        this.conceptoMovimiento = conceptoMovimiento;
        this.montoMovimiento = montoMovimiento;
    }
    */

    //Método

    //Getters y Setters


    public Empresa getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresa empresas) {
        this.empresas = empresas;
    }

    public long getRegistroMovimiento() {
        return registroMovimiento;
    }

    public void setRegistroMovimiento(Long registroMovimiento) {
        this.registroMovimiento = registroMovimiento;
    }

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

    /*
    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "usuarioEncargado='" + usuarioEncargado + '\'' +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", montoMovimiento=" + montoMovimiento +
                '}';
    }

     */
}
