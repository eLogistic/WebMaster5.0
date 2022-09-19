package com.webmasters50.eLogistic.controladores;

import com.webmasters50.eLogistic.entidades.Empresa;
import com.webmasters50.eLogistic.entidades.MovimientoDinero;
import com.webmasters50.eLogistic.servicios.ServiciosEmpresas;
import com.webmasters50.eLogistic.servicios.ServiciosMovimientoDinero;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControlMovimientoDinero {


    ServiciosMovimientoDinero servicesMov;

//constructor

    public ControlMovimientoDinero(ServiciosMovimientoDinero servicesMov){
        this.servicesMov=servicesMov;

    }

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
}
