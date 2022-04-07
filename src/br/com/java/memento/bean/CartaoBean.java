package br.com.java.memento.bean;

import java.io.Serializable;

public class CartaoBean implements Serializable{

	private static final long serialVersionUID = -5858893308684553880L;
	private Long id;
	private String tipo;
	private String codigoDeSeguranca;
	private String senha;
	
	public CartaoBean() {
	}
	public CartaoBean(Long id,String tipo, String codigoDeSeguranca,String senha) {
		this.id = id;
		this.tipo = tipo;
		this.codigoDeSeguranca=codigoDeSeguranca;
		this.senha=senha;
	}
	//GETTERS E SETTERS OMITIDOS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCodigoDeSeguranca() {
		return codigoDeSeguranca;
	}

	public void setCodigoDeSeguranca(String codigoDeSeguranca) {
		this.codigoDeSeguranca = codigoDeSeguranca;
	}

	
}
