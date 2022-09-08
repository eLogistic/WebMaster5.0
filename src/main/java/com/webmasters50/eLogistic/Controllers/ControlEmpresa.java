package com.webmasters50.eLogistic.Controllers;

import com.webmasters50.eLogistic.Entities.Empresa;
import com.webmasters50.eLogistic.Services.ServiceEmpresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlEmpresa {

    ServiceEmpresa se1 = new ServiceEmpresa();
    Empresa emp1;
    public ControlEmpresa(){
        this.emp1 = this.se1.getEmpresa();
    }
    @GetMapping("/informacion")
    public Empresa informacion(){
        return this.emp1;
    }

}
