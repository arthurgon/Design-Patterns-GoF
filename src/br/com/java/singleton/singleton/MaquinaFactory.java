package br.com.java.singleton.singleton;

import br.com.java.singleton.controller.MaquinaDeEstado;

/**
 * Classe respons�vel pela implementa��o do Singleton
 * @author ARTHUR
 *
 */
public class MaquinaFactory {

	private static MaquinaDeEstado maquinaDeEstado = null;
	/**
	 * M�todo respons�vel por garantir a mesma inst�ncia da classe.
	 * @return
	 */
	public static MaquinaDeEstado getInstance() {

		if (maquinaDeEstado == null) {
			maquinaDeEstado = new MaquinaDeEstado();
		}
		/**
		 * Retorna sempre a mesma inst�ncia
		 */
		return maquinaDeEstado;
	}
	
}
