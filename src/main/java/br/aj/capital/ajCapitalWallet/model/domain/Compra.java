package br.aj.capital.ajCapitalWallet.model.domain;

public class Compra extends Acoes {
	
	public String valorCompra;
	public String quantidadeCompra;
	
	@Override
	public String toString() {
		
		return String.format("%s - Valor de Compra *%s* - Quantidade comprada *%s* " , 
				super.toString(), valorCompra, quantidadeCompra);
	}
	
	public String getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(String valorCompra) {
		this.valorCompra = valorCompra;
	}
	public String getQuantidadeCompra() {
		return quantidadeCompra;
	}
	public void setQuantidadeCompra(String quantidadeCompra) {
		this.quantidadeCompra = quantidadeCompra;
	}
	

}