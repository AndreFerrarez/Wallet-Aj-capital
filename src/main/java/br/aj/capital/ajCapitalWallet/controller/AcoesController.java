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

import br.aj.capital.ajCapitalWallet.model.domain.Acoes;
import br.aj.capital.ajCapitalWallet.model.service.AcoesService;

@RestController
@RequestMapping("/api/acoes")
public class AcoesController {
	
	@Autowired
	private AcoesService acoesService;
	
	
	@GetMapping(value = "/listar")
	public List<Acoes> obterLista(){
		return (List<Acoes>) acoesService.obterLista();
	}
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Acoes acoes) {
		acoesService.incluir(acoes);
	}
	
	@DeleteMapping(value ="/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		acoesService.excluir(id);
	}
	
}
