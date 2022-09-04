package com.webmasters50.eLogistic.servicios;

import com.webmasters50.eLogistic.entidades.Empleado;
import com.webmasters50.eLogistic.entidades.Empresa;
import com.webmasters50.eLogistic.repositorios.RepositorioEmpleados;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiciosEmpleados {

    /*
    // el siguiente codigo se utilizo para hacer pruebas de insercion de objetos en local, se deja comentado para
    // posibles consultas de funcionamiento del codigo
    //
    // Empleado empleado1;
    // Empleado empleado2;
    // List<Empleado> listaEmpleados;
    //
    // //se crea atributo para crear la relacion con ServiciosEmpresas
    // ServiciosEmpresas empresaEmpleado = new ServiciosEmpresas();
    //
    // constructor de objetos en local
    //
    //     public ServiciosEmpleados() {
    //     Empresa empresa1 = this.empresaEmpleado.e1;
    //     this.empleado1 = new Empleado("Edwin" , "evasco%gmail.com", "coop", "cajero",empresa1);
    //     this.empleado2 = new Empleado("Marcela>" , "marcela%gmail.com", "coop", "cajero",null);
    //     this.listaEmpleados = new ArrayList<>();
    //     listaEmpleados.add(empleado1);
    //     listaEmpleados.add(empleado2);
    // }
    //

     */


    // atributos utilizando el repositorio

    private RepositorioEmpleados repositorioEm;

    //Consutructor usando repositorio

    public ServiciosEmpleados(RepositorioEmpleados repositorioEm){
        this.repositorioEm = repositorioEm;
    }

    //metodo getter para obtener lista empleados

    //metodo para visualizar a partir del metodo get

    public List<Empleado> getListaEmpleados() {
    return this.repositorioEm.findAll();
    }

    //metodo para crear a partir del post

    public Empleado crearEmpleado(Empleado nuevoEmpleado){
        return this.repositorioEm.save(nuevoEmpleado);
    }


}

