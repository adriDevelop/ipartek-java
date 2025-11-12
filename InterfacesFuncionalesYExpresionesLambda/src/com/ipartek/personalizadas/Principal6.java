package com.ipartek.personalizadas;

public class Principal6 {

    public static void main(String[] args) {

        Aritmetica aritmetica = (num1, num2) -> {
            return num1 + num2;
        };

        Aritmetica aritmetica2 = (num1, num2) -> {
            return num1 - num2;
        };

        Double resultado = Calculadora.calcular(4d, 7d, aritmetica);
        System.out.println(resultado);

        Double resultadoResta = Calculadora.calcular(97d, 95d, aritmetica2);
        System.out.println(resultadoResta);

        Double resultadoMedia = Calculadora.calcular(5d, 91d, (num1, num2) -> {
                                                                                    return (num1 + num2) / 2;
                                                                                });
        System.out.println(resultadoMedia);
    }
}
