package br.com.java.memento.bean;

import java.io.Serializable;

public class ClienteBean implements Serializable {
	
	private static final long serialVersionUID = 6298623115596913171L;
	
	private Long id;
	private String nome;
	private String rg;
	private String email;
	private String cpf;
	private CartaoBean cartao;

	public ClienteBean() {
	}
	public ClienteBean(Long id,String nome, String rg, String email, String cpf,
			CartaoBean cartao) {
		this.id=id;
		this.nome = nome;
		this.rg = rg;
		this.email = email;
		this.cpf = cpf;
		this.cartao=cartao;
	}
	//GETTERS E SETTERS OMITIDOS...
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public CartaoBean getCartao() {
		return cartao;
	}

	public void setCartao(CartaoBean cartao) {
		this.cartao = cartao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

}
