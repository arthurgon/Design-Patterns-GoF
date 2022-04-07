package br.com.java.memento.enuns;

public enum Operacao {

	CONSULTA_SALDO(1,"Consultando saldo atual..."),
	EFETUA_PAGAMENTO(2,"Efetuando pagamento...");
	
	private Integer id;
	private String descricao;
	
	private Operacao(Integer id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	//GETTERS E SETTERS OMITIDOS
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
