package com.webmasters50.eLogistic.controladores;

import com.webmasters50.eLogistic.entidades.Empleado;
import com.webmasters50.eLogistic.entidades.Empresa;
import com.webmasters50.eLogistic.entidades.MovimientoDinero;
import com.webmasters50.eLogistic.entidades.Usuario;
import com.webmasters50.eLogistic.servicios.ServiciosEmpleados;
import com.webmasters50.eLogistic.servicios.ServiciosEmpresas;
import com.webmasters50.eLogistic.servicios.ServiciosMovimientoDinero;
import com.webmasters50.eLogistic.servicios.ServiciosUsuarios;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class FrontControlador {

    ServiciosEmpleados servicesE;
    //aqui se hace uso de los servicios de usuarios
    ServiciosUsuarios serviceUs;
    ServiciosEmpresas servicesEmpre;
    ServiciosMovimientoDinero servicesMov;



    public FrontControlador(ServiciosEmpleados servicesE, ServiciosUsuarios serviceUs, ServiciosEmpresas servicesEmpre, ServiciosMovimientoDinero servicesMov) {
        this.servicesE = servicesE;
        this.serviceUs = serviceUs;
        this.servicesEmpre = servicesEmpre;
        this.servicesMov = servicesMov;
    }
//crea elementos de tipo string para visualizar etiquetas html creadas

    @GetMapping("/")//ruta raiz
    public String index(Model model, @AuthenticationPrincipal OidcUser principal){
        if (principal != null) {
            //System.out.println(principal.getClaims());
            Usuario usuario = this.serviceUs.getOrCreateUsuario(principal.getClaims());
            model.addAttribute("usuario", usuario);
        }
        return "index";
    }

    /*
    @GetMapping("/")//ruta raiz
    public String index(){
        return "index";
    }

     */

    //metodos empleados

    @GetMapping("/empleados")
    public String empleados(Model modelE){
        List<Empleado> empleados = this.servicesE.getListaEmpleados();
        modelE.addAttribute("empleados", empleados);
        return "empleados";
    }

    @GetMapping("empleados/nuevo")
    public String nuevoEmpleado(Model modelNuevoEm){
        modelNuevoEm.addAttribute("empleados", new Empleado());
        return "nuevo-empleado";
    }

    @GetMapping("/empleados/{id}")
    public String actualizarEmpleado(@PathVariable Long id, Model model){
        Empleado empleadoFind = this.servicesE.getLlamarEmpleado(id);
        model.addAttribute("empleadoFind", empleadoFind);
        return "actualizar-empleado";
    }

//metodos empresas

    @GetMapping("/empresas")
    public String empresas(Model modelE){
        List<Empresa> empresas = this.servicesEmpre.getListaEmpre();
        modelE.addAttribute("empresas", empresas);
        return "empresas";
    }

    @GetMapping("empresas/nuevo")
    public String nuevaEmpresa(Model modelNuevaEmpre){
        modelNuevaEmpre.addAttribute("empresas", new Empresa());
        return "nueva-empresa";
    }

    @GetMapping("/empresas/{id}")
    public String actualizarEmpresa(@PathVariable Long id, Model model){
        Empresa empresaFind = this.servicesEmpre.getLlamarEmpre(id);
        model.addAttribute("empresaFind", empresaFind);
        return "actualizar-empresa";
    }

    //metodos movimientos

    @GetMapping("/movimientos")
    public String movimientos(Model modelE){
        List<MovimientoDinero> movimientos = this.servicesMov.getListaMovDinero();
        modelE.addAttribute("movimientos", movimientos);
        return "movimientos";
    }

    @GetMapping("movimientos/nuevo")
    public String nuevoMovimiento(Model modelNuevoMovimiento){
        modelNuevoMovimiento.addAttribute("movimientos", new MovimientoDinero());
        return "nuevo-movimiento";
    }

    @GetMapping("/movimientos/{id}")
    public String actualizarMovimiento(@PathVariable Long id, Model model){
        MovimientoDinero movimientoFind = this.servicesMov.getLlamarMovimiento(id);
        model.addAttribute("movimientoFind", movimientoFind);
        return "actualizar-movimiento";
    }


}
