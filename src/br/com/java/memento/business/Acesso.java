package br.com.java.memento.business;

import br.com.java.memento.bean.UsuarioBean;
import br.com.java.memento.memento.CareTaker;

public interface Acesso {

	 // Cria um backup do estado do objeto
	 CareTaker backupUltimoAcesso();
	 // recupera o estado original do objeto
	 UsuarioBean restaurarAcessoAnterior(CareTaker memento);
	 Boolean getValidaAcesso(UsuarioBean usuario);
	 void setUsuario(UsuarioBean usuario);
	 void operacao(UsuarioBean user);
	 Boolean validaCartao(UsuarioBean user);
	 Boolean comparaCodigoDeSeguranca(String codigoDeSeguranca,UsuarioBean usuario);
}
