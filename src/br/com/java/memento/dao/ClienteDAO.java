package br.com.java.memento.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.java.memento.bean.CartaoBean;
import br.com.java.memento.bean.ClienteBean;

public class ClienteDAO {
	public List<ClienteBean> getAllClientes() {
		
		CartaoBean debito = new CartaoBean();
		debito.setId(1L);
		debito.setTipo("Débito");
		debito.setCodigoDeSeguranca("1234");
		debito.setSenha("memento2022");
		
		ClienteBean cliente1= new ClienteBean();
		cliente1.setId(1L);
		cliente1.setNome("Leitor Linkedin");
		cliente1.setRg("1022260");
		cliente1.setEmail("Leitor@LeitorLinkedin");
		cliente1.setCpf("261.051.416-87");
		cliente1.setCartao(debito);
		
		CartaoBean credito = new CartaoBean();
		credito.setId(2L);
		credito.setTipo("Crédito");
		credito.setCodigoDeSeguranca("5678");
		credito.setSenha("easymemento2022");
		
		ClienteBean cliente2= new ClienteBean();
		cliente2.setId(1L);
		cliente2.setNome("Leitor easy Linkedin");
		cliente2.setRg("1133370");
		cliente2.setEmail("Leitor@LeitorEasy");
		cliente2.setCpf("271.061.516-88");
		cliente2.setCartao(credito);
		
		List<ClienteBean> clientes = new ArrayList<ClienteBean>();
		clientes.add(cliente1);
		clientes.add(cliente2);

		return clientes;
	}
	public Boolean getCliente(String codigoSeguranca, String senha) {
		
		List<ClienteBean> clientes = new  ArrayList<ClienteBean>();
		clientes=getAllClientes();
		for (ClienteBean cliente : clientes) {
			if(cliente.getCartao().getCodigoDeSeguranca().equals(codigoSeguranca) && cliente.getCartao().getSenha().equalsIgnoreCase(senha)){
				return true;
			}
		}
		return false;
	}
}
