package com.exemplo.crudjava.repository;

import com.exemplo.crudjava.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}