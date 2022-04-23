package br.com.java.singleton.singleton;

import br.com.java.singleton.controller.MaquinaDeEstado;

/**
 * Classe responsável pela implementação do Singleton
 * @author ARTHUR
 *
 */
public class MaquinaFactory {

	private static MaquinaDeEstado maquinaDeEstado = null;
	/**
	 * Método responsável por garantir a mesma instância da classe.
	 * @return
	 */
	public static MaquinaDeEstado getInstance() {

		if (maquinaDeEstado == null) {
			maquinaDeEstado = new MaquinaDeEstado();
		}
		/**
		 * Retorna sempre a mesma instância
		 */
		return maquinaDeEstado;
	}
	
}
