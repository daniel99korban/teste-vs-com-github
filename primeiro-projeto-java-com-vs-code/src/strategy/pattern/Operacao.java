package strategy.pattern;
/**
 * <h1>Operação</h1>
 * 
 * <b>Nota: </b> 
 * Interface que será implementada por classes que fazem operações aritméticas
 * @author <b>Daniel Korban</b>
 * @version <i>1.0.0</i>
 * @since 21/12/2022
 */
public interface Operacao {
    /**
     * <h2>executar</h2>
     * @param n1 primeiro valorP
     * @param n2 segundo valorP
     */
    public void executar(int n1, int n2);
}
