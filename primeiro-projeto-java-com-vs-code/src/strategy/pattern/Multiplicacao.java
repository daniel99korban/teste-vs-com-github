package strategy.pattern;

public class Multiplicacao implements Operacao{
    @Override
    public void executar(int n1, int n2) {
        int res = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + res);
    }
}
