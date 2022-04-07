package br.com.java.memento.business.impl;

import br.com.java.memento.business.Transacao;

public class Consulta implements Transacao{

	@Override
	public void realizaTransacao() {
		System.out.println("Consultando");
		System.out.println("Seu saldo atual é de R$ 500,00");
	}
}
