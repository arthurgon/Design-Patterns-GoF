package br.com.java.memento.business.impl;

import br.com.java.memento.bean.UsuarioBean;
import br.com.java.memento.business.Acesso;
import br.com.java.memento.dao.CartaoDAO;
import br.com.java.memento.dao.ClienteDAO;
import br.com.java.memento.enuns.Operacao;
import br.com.java.memento.memento.CareTaker;
import br.com.java.memento.memento.Memento;
import br.com.java.memento.memento.Originator;

public class AcessoImpl implements Acesso {

	private UsuarioBean usuario;
	private Boolean valida;
	
	@Override
	public CareTaker backupUltimoAcesso() {
		return new Memento(usuario);
	}
	@Override
	public UsuarioBean restaurarAcessoAnterior(CareTaker memento) {
		return this.usuario = ((Originator)memento).getUsuario();
	}
	@Override
	public Boolean getValidaAcesso(UsuarioBean usuario) {
		
		valida = new ClienteDAO().getCliente(usuario.getCartao().
				getCodigoDeSeguranca(), 
				usuario.getCliente().getCartao().getSenha());
		if(valida){
			return true;
		}else{
			System.out.println("Acesso negado.");
			return false;
		}
	}
	@Override
	public void setUsuario(UsuarioBean usuario) {
		this.usuario=usuario;
	}
	@Override
	public void operacao(UsuarioBean usuario){
		if(usuario.getTipoDeOperacao()== Operacao.CONSULTA_SALDO.getId() ){
			System.out.println(Operacao.CONSULTA_SALDO.getDescricao());
			System.out.println("Seu saldo atual é de R$ 500,00");
		}else if(usuario.getTipoDeOperacao()==Operacao.EFETUA_PAGAMENTO.getId()){
			System.out.println(Operacao.EFETUA_PAGAMENTO.getDescricao());
			System.out.println("Pagamento efetuado.");
		}
		
	}
	@Override
	public Boolean validaCartao(UsuarioBean usuario) {
		
		valida = new CartaoDAO().getCartao(usuario.getCartao()
				.getCodigoDeSeguranca());
		if(valida){
			return true;
		}else{
			System.out.println("Cartão inválido.");
			return false;
		}
	}
	@Override
	public Boolean comparaCodigoDeSeguranca(String codigoDeSeguranca,
			UsuarioBean user) {
		if(codigoDeSeguranca.equals(user.getCartao()
				.getCodigoDeSeguranca())){
			return true;
		}else{
			System.out.println("Cartão inválido.");
			return false;
		}
	}
}
