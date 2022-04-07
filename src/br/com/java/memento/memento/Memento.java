package br.com.java.memento.memento;

import br.com.java.memento.bean.UsuarioBean;

public class Memento implements CareTaker,Originator {

	private UsuarioBean usuario;
	
	public Memento(UsuarioBean usuario) {
		this.usuario =  usuario;
	}
	@Override
	public UsuarioBean getUsuario() {
		return usuario;
	}
}
