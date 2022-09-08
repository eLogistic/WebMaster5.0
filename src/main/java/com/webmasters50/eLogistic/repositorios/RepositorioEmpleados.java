package com.webmasters50.eLogistic.repositorios;

import com.webmasters50.eLogistic.entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEmpleados extends JpaRepository<Empleado, Long> {
}
