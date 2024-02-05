package com.luigi4dev.planodesaude.service.Impl;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.luigi4dev.planodesaude.model.Beneficiario;
import com.luigi4dev.planodesaude.model.Documento;
import com.luigi4dev.planodesaude.repository.BeneficiarioRepository;
import com.luigi4dev.planodesaude.repository.DocumentoRepository;
import com.luigi4dev.planodesaude.service.PlanoDeSaudeService;

@Service
public class PlanoDeSaudeServiceImpl implements PlanoDeSaudeService {
	
	BeneficiarioRepository beneficiarioRepository;
	DocumentoRepository documentoRepository;
	
	public PlanoDeSaudeServiceImpl(BeneficiarioRepository beneficiarioRepository, DocumentoRepository documentoRepository) {
		this.beneficiarioRepository = beneficiarioRepository;
		this.documentoRepository = documentoRepository;
	}

	@Override
	public Beneficiario createBeneficiario(Beneficiario beneficiario) {
		
		return beneficiarioRepository.save(beneficiario);
	}

	@Override
	public Beneficiario updateBeneficiario(Beneficiario beneficiario) {
		
		return beneficiarioRepository.save(beneficiario);
	}

	@Override
	public String removeBeneficiario(Long id) {
		
		Beneficiario beneficiario = beneficiarioRepository.findById(id).get();
		if(beneficiario != null) {
			beneficiarioRepository.delete(beneficiario);
			return "Sucesso";
		}
		return "Falhou";
	}

	@Override
	public Beneficiario getBeneficiario(Long id) {
		return beneficiarioRepository.findById(id).get();
	}

	@Override
	public Collection<Beneficiario> getAllBeneficiarios() {
		
		return beneficiarioRepository.findAll();
	}

	public Beneficiario getDocumentosDoBeneficiario(Long id) {
		
		Documento documentoExemplo = new Documento();
		List<Documento> documentos;
		Example<Documento> example;
		
		Beneficiario beneficiario = getBeneficiario(id);
		documentoExemplo.setBeneficiario(beneficiario);
		
		example = Example.of(documentoExemplo);
		documentos = documentoRepository.findAll(example);
		beneficiario.setDocumentos(documentos);
		
		return beneficiario;
	}


}
