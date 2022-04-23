package br.com.java.singleton.test;

public class Funcionario {

	private final String nome;
    private final String funcao;
    private final String tarefa;
    
    public Funcionario(String nome, String funcao, String tarefa) {
        this.nome = nome;
        this.funcao = funcao;
        this.tarefa = tarefa;
    }
    public void printCurrentAssignment(){
        Printer printer = Printer.getInstance();
        printer.print("Funcionario: " + nome + "\n" + "Função: " + funcao + "\n" + "Tarefa: " + tarefa + "\n");
    }
}
