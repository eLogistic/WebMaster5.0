package com.webmasters50.eLogistic.repositorios;

import com.webmasters50.eLogistic.entidades.Empleado;
import com.webmasters50.eLogistic.entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEmpresas extends JpaRepository<Empresa, Long> {
}
