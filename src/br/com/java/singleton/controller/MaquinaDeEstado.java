package br.com.java.singleton.controller;

/**
 * Classe respons�vel por iniciar e finalizar nossa m�quina de estado.
 * @author ARTHUR
 *
 */
public class MaquinaDeEstado {

    /**
     * Atributo com finalidade 
     * de exibir texto.
     */
	private String nome;
	/**
	 * Atributo representativo para "startar"
	 *  a m�quina de estado.
	 */
	private boolean chaveMaquina;

	/**
	 * M�todo respons�vel por iniciar a m�quina 
	 * de estado e produzir os "pontinhos"
	 */
	public void ligarMaquina() {
		
		setChaveMaquina(true);
		System.out.println("Maquina ligada");
		/**
		 * In�cio da Thread
		 */
		new Thread(new Runnable() {
			public void run() {
				while (isChaveMaquina()) {
					System.out.print(".");
					try {
						/**
						 * Os "pontinhos" ser�o gerados a cada 1 segundo.
						 */
						Thread.sleep(1000);

					} catch (InterruptedException e) {
						System.out.println("Ocorreu uma exce��o ao executar o m�todo ligarMaquina() "+ e);
					}
				}
			}
		}).start();

	}
	/**
	 * M�todo respons�vel por encerrar a m�quina de estado.
	 */
	public void desligarMaquina() {
		chaveMaquina = false;
		System.out.println("Maquina desligada");
	}
	
	public String getNome() {
		return nome;
	}
	public boolean isChaveMaquina() {
		return chaveMaquina;
	}
	public void setChaveMaquina(boolean chaveMaquina) {
		this.chaveMaquina = chaveMaquina;
	}
}
