package br.com.java.memento.dao;

import java.util.ArrayList;
import java.util.Collection;

import br.com.java.memento.bean.CartaoBean;

public class CartaoDAO {

	public Collection<CartaoBean> getAllCartoes() {
		
		Collection<CartaoBean> cartoes = new ArrayList<CartaoBean>();
		cartoes.add(new CartaoBean(1L,"Débito","1234","memento2022"));
		cartoes.add(new CartaoBean(2L,"Crédito","5678","easymemento"));
		return cartoes;
	}
	
	public Boolean getCartao(String codigoDeSeguranca) {
		
		Collection<CartaoBean> cartoes = getAllCartoes();
		for (CartaoBean cartao : cartoes) {
			if(cartao.getCodigoDeSeguranca().equals(codigoDeSeguranca)){
				return true;
			}
		}
		return false;
	}
}
