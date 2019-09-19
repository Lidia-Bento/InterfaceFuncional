package com.ibm.aulatestes.aulateste.calculos;

@FunctionalInterface
public interface Operacao<T extends Number ,U extends  Number> {
    Number apply(T a, U b);
}
