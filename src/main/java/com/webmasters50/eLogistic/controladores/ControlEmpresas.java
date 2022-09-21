package com.webmasters50.eLogistic.controladores;

import com.webmasters50.eLogistic.entidades.Empresa;
import com.webmasters50.eLogistic.servicios.ServiciosEmpresas;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class ControlEmpresas {


    ServiciosEmpresas servicesE;
/*
    //constructor

    public ControlEmpresas(){
    this.servicesE = new ServiciosEmpresas();
    }

    @GetMapping("/empresas")
    public Empresa controlEmpresas(){
    return this.servicesE.getEmpresas();

    }



}


 */

//constructor

    public ControlEmpresas(ServiciosEmpresas servicesE){
        this.servicesE=servicesE;

    }

    /*
    @GetMapping("/empresas")
    public List<Empresa> listaEmpresas(){
        return this.servicesE.getListaEmpre();
    }

    @GetMapping("/empresas/{id}")
    public Empresa llamarEmpresa(@PathVariable Long id){
        return this.servicesE.getLlamarEmpre(id);
    }

    @PostMapping("/empresas")
    public Empresa crearEmpresa(@RequestBody Empresa e){
        return this.servicesE.crearEmpresa(e);
    }

     */

    //crear un registro

    @PostMapping("/empresas")
    public RedirectView crearEmpresa(@ModelAttribute Empresa e, Model model){
        model.addAttribute(e);
        this.servicesE.crearEmpresa(e);
        return new RedirectView("/empresas");
    }
/*
//editar un registro

    @PutMapping("/empresas/{id}")
    public Empresa actualizarEmpresas (@PathVariable Long id, @RequestBody Empresa actEmpresa){

        return this.servicesE.actualizarEmpre(id,actEmpresa);
      }

 */

    //editar un registro

    @PutMapping("/empresas/{id}")
    public RedirectView actualizarEmpresa(@PathVariable Long id, Empresa actEmpresa){
        this.servicesE.actualizarEmpre(id, actEmpresa);
        return new RedirectView("/empresas");
    }
    /*
    //borrar un registro
    @DeleteMapping("/eliminarempresa/{id}")
    public Empresa eliminarEmpresa(@PathVariable(value = "id") Long id){
        return this.servicesE.eliminarEmpre(id);
    }

     */
//borrar un registro
    @DeleteMapping("/empresas/{id}")
    public RedirectView eliminarEmpresa(@PathVariable(value = "id") Long id){
        this.servicesE.eliminarEmpre(id);
        return new RedirectView("/empresas");
    }


}
