package com.webmasters50.eLogistic.servicios;

import com.webmasters50.eLogistic.entidades.Empresa;
import com.webmasters50.eLogistic.repositorios.RepositoryEmpresa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosEmpresas {
/*    Empresa ep1;
    ServiceEmpleado se1= new ServiceEmpleado();
    public ServiciosEmpresas(){
        Empleado emple1 = this.se1.getEmpleado();
        this.ep1 = new Empresa("Elogistic","cra11",12345,6896523,emple1);
    }
    public Empresa getEmpresa(){
    return this.ep1;

    }
*/
    private RepositoryEmpresa repositorio;
    public ServiciosEmpresas(RepositoryEmpresa repositorio){
        this.repositorio = repositorio;
    }
    public List<Empresa> getRepositorio(){
        return this.repositorio.findAll();
    }
    public Empresa crearRegistro(Empresa empresa1){
       return this.repositorio.save(empresa1);
    }
}
