package com.webmasters50.eLogistic.servicios;

import com.webmasters50.eLogistic.entidades.Empleado;
import com.webmasters50.eLogistic.entidades.Empresa;
import com.webmasters50.eLogistic.entidades.MovimientoDinero;
import com.webmasters50.eLogistic.repositorios.RepositorioEmpresas;
import com.webmasters50.eLogistic.repositorios.RepositorioMovimientoDinero;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosMovimientoDinero {
/* MovimientoDinero m1;

    //constructor
    public ServiciosMovimientoDinero(){
        this.m1 = new MovimientoDinero("evasco", "Compra Televisor",100000);

    }

    //metodo get

    public MovimientoDinero getMovimientoDinero (){
        return this.m1;
    }
}

 */

// se crean servicios movimiento dinero

    private RepositorioMovimientoDinero repositorioMovDinero;

    //Consutructor usando repositorio

    public ServiciosMovimientoDinero (RepositorioMovimientoDinero repositorioMovDinero){
        this.repositorioMovDinero = repositorioMovDinero;
    }

    //metodo getter para obtener lista empresas
    //metodo para visualizar a partir del metodo get
    public List<MovimientoDinero> getListaMovDinero() {
        return this.repositorioMovDinero.findAll();
    }

    //metodo para llamar un solo movimiento

    public MovimientoDinero getLlamarMovimiento(Long id) {
        return this.repositorioMovDinero.findById(id).orElseThrow();
    }

    //metodo para crear a partir del post

    public MovimientoDinero crearMovimientoDinero(MovimientoDinero nuevoMovimientoDinero){
        return this.repositorioMovDinero.save(nuevoMovimientoDinero);
    }

    //metodo para actualizar

    public MovimientoDinero actualizarMovimientoDinero(Long id, MovimientoDinero m){
        MovimientoDinero movimientoActual = repositorioMovDinero.findById(id).orElseThrow();
        movimientoActual.setConceptoMovimiento(m.getConceptoMovimiento());
        movimientoActual.setMontoMovimiento(m.getMontoMovimiento());
        movimientoActual.setUsuarioEncargado(m.getUsuarioEncargado());
        return this.repositorioMovDinero.save(movimientoActual);
    }

    //metodo para eliminar

    public MovimientoDinero eliminarMovimientoDinero (Long id){
        MovimientoDinero movimientoActual = repositorioMovDinero.findById(id).orElseThrow();// pero esta muestra lo que se borró
        this.repositorioMovDinero.deleteById(id);//solo con esta linea funciona
        return movimientoActual;
    }

}


