package br.com.java.memento.business.impl;

import br.com.java.memento.business.Transacao;

public class Pagamento implements Transacao{

	@Override
	public void realizaTransacao() {
		System.out.println("PAGANDO");
		System.out.println("Pagamento efetuado.");
	}
}
