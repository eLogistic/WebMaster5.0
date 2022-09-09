package com.webmasters50.eLogistic.controladores;

import com.webmasters50.eLogistic.entidades.Empresa;
import com.webmasters50.eLogistic.servicios.ServiciosEmpresas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class    ControlEmpresas {

    ServiciosEmpresas servicesE;

    //constructor

    public ControlEmpresas(){
    this.servicesE = new ServiciosEmpresas();
    }

    @GetMapping("/verempresas")
    public Empresa controlEmpresas(){
    return this.servicesE.getEmpresas();

    }



}
