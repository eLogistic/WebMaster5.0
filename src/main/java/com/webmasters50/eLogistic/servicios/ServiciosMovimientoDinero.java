package com.webmasters50.eLogistic.servicios;

import com.webmasters50.eLogistic.entidades.MovimientoDinero;

public class ServiciosMovimientoDinero {

    MovimientoDinero m1;

    //constructor
    public ServiciosMovimientoDinero(){
        this.m1 = new MovimientoDinero("evasco", "Compra Televisor",100000);

    }

    //metodo get

    public MovimientoDinero getMovimientoDinero (){
        return this.m1;
    }


}
