package com.luigi4dev.planodesaude.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luigi4dev.planodesaude.model.Beneficiario;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {

}
