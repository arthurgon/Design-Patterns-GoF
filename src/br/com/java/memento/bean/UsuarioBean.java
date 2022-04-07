package br.com.java.memento.bean;

public class UsuarioBean {

	private ClienteBean cliente;
	private CartaoBean cartao;
	private Integer tipoDeOperacao;
	private Boolean acessoPermitido;
	
	//GETTERS E SETTERS OMITIDOS...
	
	public ClienteBean getCliente() {
		return cliente;
	}

	public void setCliente(ClienteBean cliente) {
		this.cliente = cliente;
	}

	public CartaoBean getCartao() {
		return cartao;
	}

	public void setCartao(CartaoBean cartao) {
		this.cartao = cartao;
	}

	public Integer getTipoDeOperacao() {
		return tipoDeOperacao;
	}

	public void setTipoDeOperacao(Integer tipoDeOperacao) {
		this.tipoDeOperacao = tipoDeOperacao;
	}

	public Boolean getAcessoPermitido() {
		return acessoPermitido;
	}

	public void setAcessoPermitido(Boolean acessoPermitido) {
		this.acessoPermitido = acessoPermitido;
	}
}
