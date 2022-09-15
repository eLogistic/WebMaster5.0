package com.webmasters50.eLogistic.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FontControlador {
    //crea elementos de tipo string para visualizar etiquetas html creadas

    @GetMapping("/")//ruta raiz
    public String index(){
        return "index";

    }
}
