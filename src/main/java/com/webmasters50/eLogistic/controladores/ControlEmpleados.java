package com.webmasters50.eLogistic.controladores;


import com.webmasters50.eLogistic.entidades.Empleado;
import com.webmasters50.eLogistic.servicios.ServiciosEmpleados;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControlEmpleados {
    //pruebas de visualizacion

/*
    @GetMapping("/vista1")
    public String visualizar(){
        return "Primera vista de web Spring Boot";
    }

    @GetMapping("/vista2")
    public Empleado ControlEmpleados() {
        Empleado e1 = new Empleado("Edwin" , "evasco%gmail.com", "coop", "cajero",null);
        return e1;
    }

 */

    ServiciosEmpleados services;

    //constructor de controlador
    public ControlEmpleados() {
        this.services = new ServiciosEmpleados();
    }

    @GetMapping("/verempleado")
    public List<Empleado> verEmpleados(){
     return  this.services.getListaEmpleados();
    }



}
