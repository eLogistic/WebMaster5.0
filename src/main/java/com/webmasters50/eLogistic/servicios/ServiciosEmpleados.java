package com.webmasters50.eLogistic.servicios;

import com.webmasters50.eLogistic.entidades.Empleado;

import java.util.ArrayList;
import java.util.List;

public class ServiciosEmpleados {

    Empleado empleado1;
    Empleado empleado2;
    List<Empleado> listaEmpleados;

    public ServiciosEmpleados() {
        this.empleado1 = new Empleado("Edwin" , "evasco%gmail.com", "coop", "cajero",null);
        this.empleado2 = new Empleado("Marcela>" , "marcela%gmail.com", "coop", "cajero",null);
        this.listaEmpleados = new ArrayList<>();
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
    }

    //metodo getter para obtener lista empleados


    public List<Empleado> getListaEmpleados() {
        return this.listaEmpleados;
    }
}

