package com.webmasters50.eLogistic.controladores;

import com.webmasters50.eLogistic.entidades.Empresa;
import com.webmasters50.eLogistic.entidades.MovimientoDinero;
import com.webmasters50.eLogistic.servicios.ServiciosEmpresas;
import com.webmasters50.eLogistic.servicios.ServiciosMovimientoDinero;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class ControlMovimientoDinero {


    ServiciosMovimientoDinero servicesMov;

//constructor

    public ControlMovimientoDinero(ServiciosMovimientoDinero servicesMov){
        this.servicesMov=servicesMov;

    }
/*
    @GetMapping("/movimientos")
    public List<MovimientoDinero> listaMovimientosDinero(){
        return this.servicesMov.getListaMovDinero();
    }

    @PostMapping("/movimientos")
    public MovimientoDinero crearMovimientoDinero(@RequestBody MovimientoDinero m){
        return this.servicesMov.crearMovimientoDinero(m);
    }

//editar un registro

    @PutMapping("/movimientos/{id}")
    public MovimientoDinero actualizarMovimientoDinero (@PathVariable Long id, @RequestBody MovimientoDinero actMovimiento){
        return this.servicesMov.actualizarMovimientoDinero(id, actMovimiento);
    }

    //borrar un registro
    @DeleteMapping("/eliminarmovimiento/{id}")
    public MovimientoDinero eliminarMovimientoDinero(@PathVariable(value = "id") Long id){
        return this.servicesMov.eliminarMovimientoDinero(id);
    }

 */

    //crear registro

    @PostMapping("/movimientos")
    public RedirectView crearMovimiento(@ModelAttribute MovimientoDinero e, Model model){
        model.addAttribute(e);
        this.servicesMov.crearMovimientoDinero(e);
        return new RedirectView("/movimientos");
    }

    //editar un registro
    @PutMapping("/movimientos/{id}")
    public RedirectView actualizarMovimiento(@PathVariable Long id, MovimientoDinero actMovimiento){
        this.servicesMov.actualizarMovimientoDinero(id, actMovimiento);
        return new RedirectView("/movimientos");
    }

    //borrar un registro
    @DeleteMapping("/movimientos/{id}")
    public RedirectView eliminarMovimiento(@PathVariable(value = "id") Long id){
        this.servicesMov.eliminarMovimientoDinero(id);
        return new RedirectView("/movimientos");
    }


}
