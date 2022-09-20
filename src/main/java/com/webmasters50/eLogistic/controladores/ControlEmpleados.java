package com.webmasters50.eLogistic.controladores;


import com.webmasters50.eLogistic.entidades.Empleado;
import com.webmasters50.eLogistic.servicios.ServiciosEmpleados;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class ControlEmpleados {

/*
    //pruebas de visualizacion en local


    @GetMapping("/vista1")
    public String visualizar(){
        return "Primera vista de web Spring Boot";
    }

    @GetMapping("/vista2")
    public Empleado ControlEmpleados() {
        Empleado e1 = new Empleado("Edwin" , "evasco%gmail.com", "coop", "cajero",null);
        return e1;
    }
    ServiciosEmpleados services;

    //constructor de controlador
    public ControlEmpleados() {
        this.services = new ServiciosEmpleados();
    }

    @GetMapping("/verempleado")
    public List<Empleado> verEmpleados(){
     return  this.services.getListaEmpleados();
    }

 */

    //nuevo codigo implementando herramientas de jpa

    ServiciosEmpleados servicesE;

    //constructor

    public ControlEmpleados(ServiciosEmpleados servicesE){
        this.servicesE=servicesE;

    }
/*
    @GetMapping("/empleados")
    public List<Empleado> listaEmpleados(){
        return this.servicesE.getListaEmpleados();
    }

 */
    @GetMapping("/empleados/{id}")
    public Empleado llamarEmpleado(@PathVariable Long id){
        return this.servicesE.getLlamarEmpleado(id);
    }


/*
    @PostMapping("/empleados")
    public Empleado crearEmpleado(@ModelAttribute Empleado e, Model model){
        model.addAttribute(e);
        return this.servicesE.crearEmpleado(e);
    }

 */

    @PostMapping("/empleados")
    public RedirectView crearEmpleado(@ModelAttribute Empleado e, Model model){
        model.addAttribute(e);
        this.servicesE.crearEmpleado(e);
       return new RedirectView("/empleados");
    }


//editar un registro

    @PutMapping("/empleados/{id}")
    public Empleado actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado actEmpleado){

        return this.servicesE.actualizarE(id, actEmpleado);

    }

    //borrar un registro
    @DeleteMapping("/eliminar/{id}")
    public Empleado eliminarEmpleado(@PathVariable(value = "id") Long id){
        return this.servicesE.eliminarP(id);
    }

}
