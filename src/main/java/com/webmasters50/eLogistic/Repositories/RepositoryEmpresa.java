package com.webmasters50.eLogistic.Repositories;

import com.webmasters50.eLogistic.Entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RepositoryEmpresa extends JpaRepository<Empresa,Long > {
}
