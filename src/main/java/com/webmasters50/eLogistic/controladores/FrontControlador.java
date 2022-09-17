package com.webmasters50.eLogistic.controladores;

import com.webmasters50.eLogistic.entidades.Empleado;
import com.webmasters50.eLogistic.servicios.ServiciosEmpleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontControlador {

    ServiciosEmpleados servicesE;

    public FrontControlador(ServiciosEmpleados servicesE) {
        this.servicesE = servicesE;
    }
//crea elementos de tipo string para visualizar etiquetas html creadas

    @GetMapping("/")//ruta raiz
    public String index(){
        return "index";
    }

    @GetMapping("/empleados")
    public String empleados(Model modelE){
        List<Empleado> empleados = this.servicesE.getListaEmpleados();
        modelE.addAttribute("empleados", empleados);
        return "empleados";
    }

    @GetMapping("empleados/nuevo")
    public String nuevoEmpleado(){
        return "nuevo-empleado";

    }




}
