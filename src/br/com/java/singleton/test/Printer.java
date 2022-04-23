package br.com.java.singleton.test;

public class Printer {

	private static Printer printer;
    private int numeroDePaginas;
    
    /**
     * Construtor privado para garantir que a 
     * classe seja instanciada apenas por ela mesma. 
     */
    private Printer() {
    }
    /**
     * Verifica se existe uma instância criada anteriormente.
     * @return printer object
     */
    public static Printer getInstance() {
        return printer == null ? 
                printer = new Printer() : 
                printer;
    }
    public void print(String text){
        System.out.println(text + "\n" + "Páginas impressas hoje " + ++numeroDePaginas + "\n" + "-------------------");
    }
}
