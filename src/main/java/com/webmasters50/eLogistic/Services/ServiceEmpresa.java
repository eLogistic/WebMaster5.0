package com.webmasters50.eLogistic.Services;

import com.webmasters50.eLogistic.Entities.Empleado;
import com.webmasters50.eLogistic.Entities.Empresa;

public class ServiceEmpresa {
    Empresa ep1;
    ServiceEmpleado se1= new ServiceEmpleado();
    public ServiceEmpresa(){
        Empleado emple1 = this.se1.getEmpleado();
        this.ep1 = new Empresa("Elogistic","cra11",12345,6896523,emple1);
    }
    public Empresa getEmpresa(){
    return this.ep1;

    }

}
