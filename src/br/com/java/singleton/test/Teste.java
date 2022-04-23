package br.com.java.singleton.test;

import br.com.java.singleton.controller.MaquinaDeEstado;
import br.com.java.singleton.singleton.MaquinaFactory;

public class Teste {

	public static void main(String[] args) {

		// Maquina maquina = new Maquina("Maquina Instancia Normal");
		MaquinaDeEstado maquinaDeEstado = MaquinaFactory.getInstance();
		
		maquinaDeEstado.ligarMaquina();

		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("Ocorreu uma exceção ao executar o método ligarMaquina() "+ e);
		}
		maquinaDeEstado.desligarMaquina();

	}

}
