package com.webmasters50.eLogistic.repositorios;

import com.webmasters50.eLogistic.entidades.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioMovimientoDinero extends JpaRepository<MovimientoDinero, Long> {
}
