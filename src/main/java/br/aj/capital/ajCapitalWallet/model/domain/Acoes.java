package br.aj.capital.ajCapitalWallet.model.domain;

public class Acoes {
	
	private String code;
	private String nome;
	private String descricao;
	
	public String toString() {
		return String.format("Codigo *%s* - Nome da Empresa *%s* - Descricao *%s*", code, nome, descricao);
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
