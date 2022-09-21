package com.webmasters50.eLogistic.servicios;

import com.webmasters50.eLogistic.entidades.Usuario;
import com.webmasters50.eLogistic.repositorios.repositorioUsuarios;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ServiciosUsuarios {

    private repositorioUsuarios repositorioUs;

    //constructor


    public ServiciosUsuarios(repositorioUsuarios repositorioUs) {
        this.repositorioUs = repositorioUs;
    }

    //getters y setters


    public repositorioUsuarios getRepositorioUs() {
        return repositorioUs;
    }

    public void setRepositorioUs(repositorioUsuarios repositorioUs) {
        this.repositorioUs = repositorioUs;
    }

    //metodos funcionales
    //funcion que crea un nuevo usuario

    public Usuario buscarPorEmail(String email){
        return  this.repositorioUs.findByEmail(email);
    }

    //funcion que guarda un usuario
    public Usuario crearUsuario(Usuario nuevoUsuario){
        return this.repositorioUs.save(nuevoUsuario);
    }

    public Usuario getOrCreateUsuario(Map<String, Object> datosUsuario){
        String email = (String) datosUsuario.get("email");
        Usuario usuario = buscarPorEmail(email);
        //validamos si existe usuario
        if (usuario == null){
            String alias = (String) datosUsuario.get("nickname");
            String imagen = (String) datosUsuario.get("picture");
            String auth0Id = (String) datosUsuario.get("sub");

            Usuario nuevoUsuario = new Usuario(email=email, imagen=imagen, auth0Id=auth0Id);
            return crearUsuario(nuevoUsuario);
        }
        System.out.println(usuario.getEmail());
        return usuario;

    }


}
