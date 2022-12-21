package strategy.pattern;

public class Calculadora {
    
    private int n1;
    private int n2;
    // strategy pattern
    private Operacao operacao;
 
    public Calculadora(int n1, int n2, Operacao operacao) {
        this.n1 = n1;
        this.n2 = n2;
        this.operacao = operacao;
    }
    
    public void calcular() {
        operacao.executar(n1, n2);
    }

}
