package com.webmasters50.eLogistic.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlEmpresa {

    @GetMapping("/vista1")
    public String informacion(){
        return "Hola mundo";
    }

}
