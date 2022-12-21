package com.daniel.teste;

import strategy.pattern.*;

public class Teste {
    public static void main(String[] args) throws Exception{
        // implementação das operações
        Operacao soma = new Soma();
        Operacao subtracao = new Subtracao();
        Operacao divisao = new Divisao();
        Operacao multiplicacao = new Multiplicacao();

        Calculadora cal = new Calculadora(2, 3, subtracao);
        cal.calcular();
    }
}
