package com.webmasters50.eLogistic.servicios;

import com.webmasters50.eLogistic.entidades.Empleado;
import com.webmasters50.eLogistic.entidades.Empresa;

import java.util.ArrayList;
import java.util.List;

public class ServiciosEmpleados {

    Empleado empleado1;
    Empleado empleado2;
    List<Empleado> listaEmpleados;

    //se crea atributo para crear la relacion con ServiciosEmpresas
    ServiciosEmpresas empresaEmpleado = new ServiciosEmpresas();


    //constructor
    public ServiciosEmpleados() {
        Empresa empresa1 = this.empresaEmpleado.e1;
        this.empleado1 = new Empleado("Edwin" , "evasco%gmail.com", "coop", "cajero",empresa1);
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

