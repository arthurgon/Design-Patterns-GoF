package br.com.java.singleton.controller;

/**
 * Classe responsável por iniciar e finalizar nossa máquina de estado.
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
	 *  a máquina de estado.
	 */
	private boolean chaveMaquina;

	/**
	 * Método responsável por iniciar a máquina 
	 * de estado e produzir os "pontinhos"
	 */
	public void ligarMaquina() {
		
		setChaveMaquina(true);
		System.out.println("Maquina ligada");
		/**
		 * Início da Thread
		 */
		new Thread(new Runnable() {
			public void run() {
				while (isChaveMaquina()) {
					System.out.print(".");
					try {
						/**
						 * Os "pontinhos" serão gerados a cada 1 segundo.
						 */
						Thread.sleep(1000);

					} catch (InterruptedException e) {
						System.out.println("Ocorreu uma exceção ao executar o método ligarMaquina() "+ e);
					}
				}
			}
		}).start();

	}
	/**
	 * Método responsável por encerrar a máquina de estado.
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
