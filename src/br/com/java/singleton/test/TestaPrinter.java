package br.com.java.singleton.test;

public class TestaPrinter {

	public static void main(String[] args) {
		
		/**
		 * Cria uma inst�ncia para cada funcion�rio.
		 */
		Funcionario arthur = new Funcionario("Arthur", "CEO", "Tomando decis�es executivas");
		Funcionario saudate = new Funcionario("Saudate", "Consultor", "Prestando consultoria para a empresa");
		Funcionario ausilene = new Funcionario("Ausilene", "Vendedora", "Vendendo os produtos da empresa");
		Funcionario rodrigo = new Funcionario("Rodrigo", "Developer","Desenvolvendo a vers�o mais recente do APP da empresa.");
        
        /**
         * Invoca uma a uma as a��es de solicita��o
         *  de impress�o dos funcion�rios
         */
		arthur.printCurrentAssignment();
        saudate.printCurrentAssignment();
        ausilene.printCurrentAssignment();
        rodrigo.printCurrentAssignment();
    }
}
