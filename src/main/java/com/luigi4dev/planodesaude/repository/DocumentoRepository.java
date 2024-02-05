package com.luigi4dev.planodesaude.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luigi4dev.planodesaude.model.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {

}
