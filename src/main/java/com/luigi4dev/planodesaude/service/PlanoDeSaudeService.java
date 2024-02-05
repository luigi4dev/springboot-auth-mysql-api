package com.luigi4dev.planodesaude.service;

import java.util.Collection;

import com.luigi4dev.planodesaude.model.Beneficiario;


public interface PlanoDeSaudeService {
	
	public Beneficiario createBeneficiario(Beneficiario beneficiario);
	public Beneficiario updateBeneficiario(Beneficiario beneficiario);
	public Beneficiario getBeneficiario(Long id);
	public String removeBeneficiario(Long id);
	
	public Collection<Beneficiario> getAllBeneficiarios();
	public Beneficiario getDocumentosDoBeneficiario(Long id);

}
