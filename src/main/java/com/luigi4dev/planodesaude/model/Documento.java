package com.luigi4dev.planodesaude.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="documento")
public class Documento {
	
	private @Id @GeneratedValue Long id;
	private String tipoDocumento;
	private String descricao;
	private String dataInclusao;
	private String dataAtualizacao;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "beneficiario_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Beneficiario beneficiario;
	
	public Documento(String tipoDocumento, String descricao, String dataInclusao, String dataAtualizacao) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.descricao = descricao;
		this.dataInclusao = dataInclusao;
		this.dataAtualizacao = dataAtualizacao;
	}
	
	public Documento() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
	
	public Beneficiario getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(Beneficiario beneficiario) {
		this.beneficiario = beneficiario;
	}

	//Sobrepus o método toString() apenas para facilitar a visualização dos dados na chamada da API
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Id: "+getId()+" \n");
		sb.append("Tipo Documento: "+getTipoDocumento()+" \n");
		sb.append("Descricao: "+getDescricao()+" \n");
		sb.append("Data Inclusao: "+getDataInclusao()+" \n");
		sb.append("Data Atualizacao: "+getDataAtualizacao()+" \n");
		
		return sb.toString();
	}
}
