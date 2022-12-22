package strategy.pattern;

/**
 * <h1>Calculadora</h1>
 * 
 * <b>Nota: </b> 
 * Calculadora simples
 * @author <b>Daniel Korban</b>
 * @version <i>1.0.0</i>
 * @since 21/12/2022
 */
public class Calculadora {
    
    private int n1;
    private int n2;
    // strategy pattern
    private Operacao operacao;
    
    /**
     * Construtor padrão
     * @param n1 primeiro valor
     * @param n2 segundo valor
     * @param operacao qualqer objeto cuja a classe implemente a interface <b>Operacao</b>
     */
    public Calculadora(int n1, int n2, Operacao operacao) {
        this.n1 = n1;
        this.n2 = n2;
        this.operacao = operacao;
    }
    /*
     * Metodo que delega a função de calcular ao metodo da <b>Operacao</b>
     */
    public void calcular() {
        operacao.executar(n1, n2);
    }

}
