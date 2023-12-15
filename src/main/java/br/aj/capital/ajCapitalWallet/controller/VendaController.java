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

import br.aj.capital.ajCapitalWallet.model.domain.Venda;
import br.aj.capital.ajCapitalWallet.model.service.VendaService;

@RestController
@RequestMapping("/api/venda")
public class VendaController {
	
	@Autowired
	private VendaService vendaService;
	
	
	@GetMapping(value = "/listar")
	public List<Venda> obterLista(){
		return (List<Venda>) vendaService.obterLista();
	}
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Venda venda) {
		vendaService.incluir(venda);
	}
	
	@DeleteMapping(value ="/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		vendaService.excluir(id);
	}
	
}
