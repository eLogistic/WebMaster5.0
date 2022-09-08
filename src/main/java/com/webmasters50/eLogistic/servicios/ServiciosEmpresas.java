package com.webmasters50.eLogistic.servicios;

import com.webmasters50.eLogistic.entidades.Empresa;
import com.webmasters50.eLogistic.entidades.MovimientoDinero;

public class ServiciosEmpresas {
    Empresa e1;
    //atributo para relacionar servicios movimiento de dinero
    ServiciosMovimientoDinero serMovDin1 = new ServiciosMovimientoDinero();

    public ServiciosEmpresas(){
        MovimientoDinero ingreso1 = this.serMovDin1.m1;
        this.e1 = new Empresa("cooperativa" , "calle 1 11 24", 2111924,
                895006565,ingreso1);

    }

    public Empresa getEmpresas() {
        return e1;
    }
}
