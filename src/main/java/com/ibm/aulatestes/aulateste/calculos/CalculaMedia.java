package com.ibm.aulatestes.aulateste.calculos;

public class CalculaMedia {
    public Double media(Double valor1, Double valor2) {
        Operacao<Double, Double> operacao = (a, b) -> ((a+b)/2);
        return operacao.apply(valor1, valor2).doubleValue();
    }
}
