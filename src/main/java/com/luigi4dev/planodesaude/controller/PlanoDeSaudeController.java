package com.luigi4dev.planodesaude.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luigi4dev.planodesaude.model.Beneficiario;
import com.luigi4dev.planodesaude.service.PlanoDeSaudeService;

@RestController
@RequestMapping("/beneficiario/")
public class PlanoDeSaudeController {
	
	PlanoDeSaudeService planoDeSaudeService;

	public PlanoDeSaudeController(PlanoDeSaudeService planoDeSaudeService) {
		this.planoDeSaudeService = planoDeSaudeService;
	}
	
	
	@GetMapping("{id}")
	public String getBeneficiario(@PathVariable("id") Long id) {
		
		Beneficiario beneficiario = planoDeSaudeService.getBeneficiario(id);
		return beneficiario.toString();
	}
	
	@GetMapping("/list")
	public String getAllBeneficiario() {
		
		Collection<Beneficiario> beneficiarios = planoDeSaudeService.getAllBeneficiarios();
		return beneficiarios.toString();
	}
	
	@PostMapping
	public String createBeneficiario(@RequestBody Beneficiario beneficiario) {
		
		Beneficiario savedBeneficiario = planoDeSaudeService.createBeneficiario(beneficiario);
		return savedBeneficiario.toString();
	}
	
	@PutMapping
	public String updateBeneficiario(@RequestBody Beneficiario beneficiario) {
		
		Beneficiario savedBeneficiario = planoDeSaudeService.updateBeneficiario(beneficiario);
		return savedBeneficiario.toString();
	}
	
	@DeleteMapping("{id}")
	public String removeBeneficiario(@PathVariable("id") Long id) {
		
		String result = planoDeSaudeService.removeBeneficiario(id);
		return result;
	}
	
	@GetMapping("{id}/documentos")
	public String getDocumentosDoBeneficiario(@PathVariable("id") Long id) {
		
		Beneficiario beneficiario = planoDeSaudeService.getDocumentosDoBeneficiario(id);
		
		return beneficiario.listarDocumentos();
	}
	
	
}
