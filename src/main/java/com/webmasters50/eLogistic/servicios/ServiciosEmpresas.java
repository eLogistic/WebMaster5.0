package com.webmasters50.eLogistic.servicios;

import com.webmasters50.eLogistic.entidades.Empresa;
import com.webmasters50.eLogistic.repositorios.RepositorioEmpresas;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosEmpresas {

/*
    Empresa e1;
    //atributo para relacionar servicios movimiento de dinero
    ServiciosMovimientoDinero serMovDin1 = new ServiciosMovimientoDinero();

    public ServiciosEmpresas(){
        MovimientoDinero ingreso1 = this.serMovDin1.m1;
        this.e1 = new Empresa("cooperativa" , "calle 1 11 24", 2111924,
                895006565,ingreso1);

    }

    public Empresa getEmpresas() {
        return e1;
    }
}


 */

// se crean servicios empresas

    private RepositorioEmpresas repositorioEmpre;

    //Consutructor usando repositorio

    public ServiciosEmpresas(RepositorioEmpresas repositorioEmpre){
        this.repositorioEmpre = repositorioEmpre;
    }

    //metodo getter para obtener lista empresas
    //metodo para visualizar a partir del metodo get
    public List<Empresa> getListaEmpre() {
        return this.repositorioEmpre.findAll();
    }

    //llamar uno solo
    public Empresa getLlamarEmpre(Long id){
        return this.repositorioEmpre.findById(id).orElseThrow();
    }

    //metodo para crear a partir del post

    public Empresa crearEmpresa(Empresa nuevaEmpresa){
        return this.repositorioEmpre.save(nuevaEmpresa);
    }

    //metodo para actualizar

    public Empresa actualizarEmpre(Long id, Empresa e){
        Empresa empresaActual = repositorioEmpre.findById(id).orElseThrow();
        empresaActual.setNombreEmpresa(e.getNombreEmpresa());
        //empresaActual.setNitEmpresa(e.getNitEmpresa());
        empresaActual.setDireccionEmpresa(e.getDireccionEmpresa());
        empresaActual.setTelefonoEmpresa(e.getTelefonoEmpresa());
        return this.repositorioEmpre.save(empresaActual);
    }

    //metodo para eliminar

    public Empresa eliminarEmpre (Long id){
        Empresa empresaActual = repositorioEmpre.findById(id).orElseThrow();// pero esta muestra lo que se borró
        this.repositorioEmpre.deleteById(id);//solo con esta linea funciona
        return empresaActual;
    }

}


