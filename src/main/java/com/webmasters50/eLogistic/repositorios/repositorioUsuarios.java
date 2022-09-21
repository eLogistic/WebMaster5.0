package com.webmasters50.eLogistic.repositorios;

import com.webmasters50.eLogistic.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioUsuarios extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);

}
