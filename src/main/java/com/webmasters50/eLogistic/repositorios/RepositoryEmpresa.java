package com.webmasters50.eLogistic.repositorios;

import com.webmasters50.eLogistic.entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RepositoryEmpresa extends JpaRepository<Empresa,Long > {
}
