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

import br.aj.capital.ajCapitalWallet.model.domain.Compra;
import br.aj.capital.ajCapitalWallet.model.service.CompraService;

@RestController
@RequestMapping("/api/compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	
	@GetMapping(value = "/listar")
	public List<Compra> obterLista(){
		return (List<Compra>) compraService.obterLista();
	}
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Compra compra) {
		compraService.incluir(compra);
	}
	
	@DeleteMapping(value ="/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		compraService.excluir(id);
	}
	
}
