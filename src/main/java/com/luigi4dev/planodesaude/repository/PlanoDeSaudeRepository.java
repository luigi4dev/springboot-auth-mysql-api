package com.luigi4dev.planodesaude.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luigi4dev.planodesaude.model.Beneficiario;

public interface PlanoDeSaudeRepository extends JpaRepository<Beneficiario, Long> {

}
