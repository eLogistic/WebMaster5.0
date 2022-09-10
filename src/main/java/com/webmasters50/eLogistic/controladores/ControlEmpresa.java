package com.webmasters50.eLogistic.controladores;

import com.webmasters50.eLogistic.entidades.Empresa;
import com.webmasters50.eLogistic.servicios.ServiciosEmpresas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControlEmpresa {
/*
    ServiciosEmpresas se1 = new ServiciosEmpresas();
    Empresa emp1;
    public ControlEmpresa(){
        this.emp1 = this.se1.getEmpresa();
    }
    @GetMapping("/informacion")
    public Empresa informacion(){
        return this.emp1;
    }
*/
    ServiciosEmpresas se1;
    public ControlEmpresa(ServiciosEmpresas se1){
        this.se1 = se1;
    }
    @GetMapping("/informacion")
    public List<Empresa> informacion(){
        return this.se1.getRepositorio();
    }

    @PostMapping("/informacion")
    public Empresa crearEmpresa(@RequestBody Empresa emp){
        return this.se1.crearRegistro(emp);
    }
}
