package com.luigi4dev.planodesaude.model;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="beneficiario")
public class Beneficiario {
	
	private @Id @GeneratedValue Long id;
	private String nome;
	private String telefone;
	private String dataNascimento;
	private String dataInclusao;
	private String dataAtualizacao;
	
	@Transient
	private Collection<Documento> documentos;
	
	
	public Beneficiario() {
		
	}
	
	public Beneficiario(String nome, String telefone, String dataNascimento, String dataInclusao, String dataAtualizacao) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.dataInclusao = dataInclusao;
		this.dataAtualizacao = dataAtualizacao;
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(String dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public String getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public Collection<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(Collection<Documento> documentos) {
		this.documentos = documentos;
	}

	public void updateMembers(Beneficiario updateBeneficiario) {
		
		this.nome = updateBeneficiario.nome;
		this.telefone = updateBeneficiario.telefone;
	}

	//Sobrepus o método toString() apenas para facilitar a visualização dos dados na chamada da API
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Id: "+getId()+" \n");
		sb.append("Nome: "+getNome()+" \n");
		sb.append("Telefone: "+getTelefone()+" \n");
		
		return sb.toString();
	}
	
	public String listarDocumentos() {
		StringBuilder sb = new StringBuilder();
		
		if(documentos != null && !documentos.isEmpty()) {
			sb.append("Documentos Cadastrados para: " + this.getNome() + " - ID: " + this.getId() + "\n\n");
			for(Documento d : documentos) {
				sb.append(d.toString() + "\n \n");
			}
		}
		return sb.toString();
	}

}
