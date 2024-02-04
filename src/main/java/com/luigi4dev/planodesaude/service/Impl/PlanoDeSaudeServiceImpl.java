package com.luigi4dev.planodesaude.service.Impl;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.luigi4dev.planodesaude.model.Beneficiario;
import com.luigi4dev.planodesaude.repository.PlanoDeSaudeRepository;
import com.luigi4dev.planodesaude.service.PlanoDeSaudeService;

@Service
public class PlanoDeSaudeServiceImpl implements PlanoDeSaudeService {
	
	PlanoDeSaudeRepository repository;

	public PlanoDeSaudeServiceImpl(PlanoDeSaudeRepository repository) {
		this.repository = repository;
	}

	@Override
	public Beneficiario createBeneficiario(Beneficiario beneficiario) {
		repository.save(beneficiario);
		return null;
	}

	@Override
	public Beneficiario updateBeneficiario(Beneficiario beneficiario) {
		repository.save(beneficiario);
		return null;
	}

	@Override
	public String removeBeneficiario(Long id) {
		Beneficiario beneficiario = repository.findById(id).get();
		if(beneficiario != null) {
			repository.delete(beneficiario);
			return "Sucesso";
		}
		return "Falhou";
	}

	@Override
	public Beneficiario getBeneficiario(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Collection<Beneficiario> getAllBeneficiarios() {
		
		return repository.findAll();
	}

}
