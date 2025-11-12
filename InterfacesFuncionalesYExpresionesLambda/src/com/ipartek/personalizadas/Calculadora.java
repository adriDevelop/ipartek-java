package com.ipartek.personalizadas;

public class Calculadora {

    public static Double sumar(Double n1, Double n2){
        return n1 + n2;
    }

    public static Double restar(Double n1, Double n2){
        return n1 - n2;
    }

    public static Double multiplicar(Double n1, Double n2){
        return n1 * n2;
    }

    public static Double dividir(Double n1, Double n2){
        return n1 / n2;
    }

    public static Double calcular(Double d1, Double d2, Aritmetica lambda){
        return lambda.operacion(d1, d2);
    }
}
