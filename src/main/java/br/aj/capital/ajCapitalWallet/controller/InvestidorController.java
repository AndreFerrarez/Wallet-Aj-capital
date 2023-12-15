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

import br.aj.capital.ajCapitalWallet.model.domain.Investidor;
import br.aj.capital.ajCapitalWallet.model.service.InvestidorService;

@RestController
@RequestMapping("/api/investidor")
public class InvestidorController {
	
	@Autowired
	private InvestidorService investidorService;
	
	
	@GetMapping(value = "/listar")
	public List<Investidor> obterLista(){
		return (List<Investidor>) investidorService.obterLista();
	}
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Investidor investidor) {
		investidorService.incluir(investidor);
	}
	
	@DeleteMapping(value ="/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		investidorService.excluir(id);
	}
	
}
