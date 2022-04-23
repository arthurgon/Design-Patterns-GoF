package br.com.java.singleton.test;

public class TestaPrinter {

	public static void main(String[] args) {
		
		/**
		 * Cria uma instância para cada funcionário.
		 */
		Funcionario arthur = new Funcionario("Arthur", "CEO", "Tomando decisões executivas");
		Funcionario saudate = new Funcionario("Saudate", "Consultor", "Prestando consultoria para a empresa");
		Funcionario ausilene = new Funcionario("Ausilene", "Vendedora", "Vendendo os produtos da empresa");
		Funcionario rodrigo = new Funcionario("Rodrigo", "Developer","Desenvolvendo a versão mais recente do APP da empresa.");
        
        /**
         * Invoca uma a uma as ações de solicitação
         *  de impressão dos funcionários
         */
		arthur.printCurrentAssignment();
        saudate.printCurrentAssignment();
        ausilene.printCurrentAssignment();
        rodrigo.printCurrentAssignment();
    }
}
