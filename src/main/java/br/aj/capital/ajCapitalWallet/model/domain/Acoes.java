package br.aj.capital.ajCapitalWallet.model.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "T_Acoes")
public class Acoes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String code;
	private String nome;
	private String descricao;

	@ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
	@JoinColumn(name = "idInvestidor")
	private Investidor investidor;

	@Override
	public String toString() {
		return String.format("Investidor Id (%d) - Acao ID (%d) - Codigo (%s) - Nome da Empresa (%s) - Descricao (%s)",
				investidor != null ? investidor.getId() : null, id, code, nome, descricao);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Investidor getInvestidor() {
		return investidor;
	}

	public void setInvestidor(Investidor investidor) {
		this.investidor = investidor;
	}

}
