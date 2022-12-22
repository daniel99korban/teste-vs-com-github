
import strategy.pattern.*;

public class Teste {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        // implementação das operações
        Operacao soma = new Soma();
        Operacao subtracao = new Subtracao();
        Operacao divisao = new Divisao();
        Operacao multiplicacao = new Multiplicacao();
        Calculadora calculadora = null;

        int n1 = Integer.valueOf(args[0]);
        int n2 = Integer.valueOf(args[1]);
        String operacao = args[2];

        switch(operacao){
            case "soma":
                calculadora = new Calculadora(n1, n2, soma);
                break;
            case "subtracao":
                calculadora = new Calculadora(n1, n2, subtracao);
                break;
            case "multiplicacao":
                calculadora = new Calculadora(n1, n2, multiplicacao);
                break;
            case "divisao":
                calculadora = new Calculadora(n1, n2, divisao);
                break;
        }
        if(calculadora!=null)
            calculadora.calcular();
    }
}
