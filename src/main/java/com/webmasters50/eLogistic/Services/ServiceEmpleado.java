package com.webmasters50.eLogistic.Services;

import com.webmasters50.eLogistic.Entities.Empleado;

public class ServiceEmpleado {
    Empleado emp1;
    public ServiceEmpleado(){
        this.emp1 = new Empleado("Miguel","miguel@gmail.com","Elogistic","admin",null);

    }

    public Empleado getEmpleado(){
        return this.emp1;
    }
}
