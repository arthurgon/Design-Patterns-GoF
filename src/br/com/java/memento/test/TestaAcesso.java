package br.com.java.memento.test;

import java.util.Scanner;

import br.com.java.memento.bean.CartaoBean;
import br.com.java.memento.bean.ClienteBean;
import br.com.java.memento.bean.UsuarioBean;
import br.com.java.memento.business.Acesso;
import br.com.java.memento.business.impl.AcessoImpl;
import br.com.java.memento.memento.CareTaker;

public class TestaAcesso {

	Scanner entrada;
	Boolean FOLLOW = true;
	UsuarioBean user = new UsuarioBean();
	CartaoBean cartao = new CartaoBean();
	ClienteBean cliente = new ClienteBean();
	Acesso access = new AcessoImpl();
	CareTaker memento=null;
	
	public UsuarioBean inicializa(CartaoBean cartao,ClienteBean cliente,UsuarioBean user){
		 
		 user = new UsuarioBean();
		 cartao = new CartaoBean();
		 user.setCartao(cartao);
		 cliente = new ClienteBean();
		 user.setCliente(cliente);
		 
		 return user;
	}
	public void insereCartao(){
		
		entrada = new Scanner(System.in);
		System.out.println("Bem-vindo ao banco memento.");
		System.out.println("Insira o seu cartão.");
		cartao.setCodigoDeSeguranca(entrada.next());
		user.setCartao(cartao);
		user.setAcessoPermitido(access.validaCartao(user));
		System.out.println("Código de segurança: " 
				+ user.getCartao().getCodigoDeSeguranca());
		if(user.getAcessoPermitido()){
			validaSenha();
		}
	}

	
	public void validaSenha(){
		
		System.out.println("Digite a sua senha: ");
		cartao.setSenha(entrada.next());
		cliente.setCartao(cartao);
		user.setCliente(cliente);
		access.setUsuario(user);
		user.setAcessoPermitido(access.getValidaAcesso(user));
		System.out.println("Senha: " + user.getCartao().getSenha());
		if(user.getAcessoPermitido()){
			selecionaOperacao();
		}
	}
	public void selecionaOperacao(){
		
		System.out.println("Digite o número da operação "
				+ "que deseja realizar: (1) Consulta - (2) Pagamentos");
		user.setTipoDeOperacao(entrada.nextInt());

		
		access.operacao(user);
		System.out.println("Operação finalizada.");
		memento = access.backupUltimoAcesso();
		user=inicializa( cartao, cliente, user);
		System.out.println("Código de segurança: " 
		+ user.getCartao().getCodigoDeSeguranca());
		System.out.println("Senha: " + user.getCartao().getSenha());
		realizaNovaOperacao( memento);
	}
	
	public void realizaNovaOperacao(CareTaker memento){
		while (FOLLOW) {
			System.out.println("Deseja realizar uma nova operação? (Digite S ou N)");
			if(entrada.next().equalsIgnoreCase("N")){
				FOLLOW=Boolean.FALSE;
				memento=null;
			}
			if(FOLLOW){

				System.out.println("Insira o seu cartão.");
				String codigoDeSeguranca=entrada.next();
				cartao.setCodigoDeSeguranca(access.restaurarAcessoAnterior(memento)
						.getCartao().getCodigoDeSeguranca());
				System.out.println("Código de segurança: " 
						+ cartao.getCodigoDeSeguranca());
				cartao.setSenha(access.restaurarAcessoAnterior(memento)
						.getCliente().getCartao().getSenha());
				System.out.println("Senha: " + cartao.getSenha());
				user.setCartao(cartao);
				user.setAcessoPermitido(access.comparaCodigoDeSeguranca(codigoDeSeguranca, user));
				if(user.getAcessoPermitido()){
					System.out.println("Digite o número da operação "
							+ "que deseja realizar: (1) Consulta - (2) Pagamentos");
					user.setTipoDeOperacao(entrada.nextInt());
					access.operacao(user);
					System.out.println("Operação finalizada.");
					inicializa( cartao, cliente, user);
					System.out.println("Código de segurança: " 
					+ user.getCartao().getCodigoDeSeguranca());
					System.out.println("Senha: " + user.getCartao().getSenha());
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		TestaAcesso teste = new TestaAcesso();
		teste.insereCartao();
		System.out.println("Processo finalizado.");
	}
}
