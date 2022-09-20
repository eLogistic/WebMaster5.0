package com.webmasters50.eLogistic.controladores;

import com.webmasters50.eLogistic.entidades.Empresa;
import com.webmasters50.eLogistic.servicios.ServiciosEmpresas;
import org.springframework.web.bind.annotation.*;

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

//editar un registro

    @PutMapping("/empresas/{id}")
    public Empresa actualizarEmpresas (@PathVariable Long id, @RequestBody Empresa actEmpresa){

        return this.servicesE.actualizarEmpre(id,actEmpresa);
      }

    //borrar un registro
    @DeleteMapping("/eliminarempresa/{id}")
    public Empresa eliminarEmpresa(@PathVariable(value = "id") Long id){
        return this.servicesE.eliminarEmpre(id);
    }

}
