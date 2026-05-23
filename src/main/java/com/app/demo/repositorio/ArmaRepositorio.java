package com.app.demo.repositorio;

import com.app.demo.modelo.Arma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArmaRepositorio extends JpaRepository<Arma, Long> {

}
