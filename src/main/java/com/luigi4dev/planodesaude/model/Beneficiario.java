package com.luigi4dev.planodesaude.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="beneficiario")
public class Beneficiario {
	
	private @Id @GeneratedValue Long id;
	private String nome;
	private String telefone;
	
	public Beneficiario() {
		
	}
	
	public Beneficiario(Long id, String nome, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void updateMembers(Beneficiario updateBeneficiario) {
		
		this.nome = updateBeneficiario.nome;
		this.telefone = updateBeneficiario.telefone;
	}

}
