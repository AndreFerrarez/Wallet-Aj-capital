package br.aj.capital.ajCapitalWallet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.aj.capital.ajCapitalWallet.model.domain.Analise;
import br.aj.capital.ajCapitalWallet.model.service.AnaliseService;

@RestController
@RequestMapping("/api/analise")
public class AnaliseController {
	
	@Autowired
	private AnaliseService analiseService;
	
	
	@GetMapping(value = "/listar")
	public List<Analise> obterLista(){
		return (List<Analise>) analiseService.obterLista();
	}
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Analise analise) {
		analiseService.incluir(analise);
	}
	
	@DeleteMapping(value ="/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		analiseService.excluir(id);
	}
	
}
