package com.ibm.aulatestes.aulateste.calculos;

public class CalculaDivisao {
    public Double divisao(Double valor1, Double valor2) {
        Operacao<Double, Double> operacao = (a, b) -> (a/b);
        return operacao.apply(valor1, valor2).doubleValue();
    }
}
