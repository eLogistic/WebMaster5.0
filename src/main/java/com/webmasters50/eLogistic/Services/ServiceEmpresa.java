package com.webmasters50.eLogistic.Services;

import com.webmasters50.eLogistic.Entities.Empleado;
import com.webmasters50.eLogistic.Entities.Empresa;
import com.webmasters50.eLogistic.Repositories.RepositoryEmpresa;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEmpresa {
/*    Empresa ep1;
    ServiceEmpleado se1= new ServiceEmpleado();
    public ServiceEmpresa(){
        Empleado emple1 = this.se1.getEmpleado();
        this.ep1 = new Empresa("Elogistic","cra11",12345,6896523,emple1);
    }
    public Empresa getEmpresa(){
    return this.ep1;

    }
*/
    private RepositoryEmpresa repositorio;
    public ServiceEmpresa(RepositoryEmpresa repositorio){
        this.repositorio = repositorio;
    }
    public List<Empresa> getRepositorio(){
        return this.repositorio.findAll();
    }
    public Empresa crearRegistro(Empresa empresa1){
       return this.repositorio.save(empresa1);
    }
}
