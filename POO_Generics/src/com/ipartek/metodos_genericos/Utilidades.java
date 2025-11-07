package com.ipartek.metodos_genericos;

import java.util.Arrays;
import java.util.Comparator;

public class Utilidades {

    public static <T> void imprimir(T[] elArray){
        Arrays.stream(elArray).toList().forEach(System.out::println);
    }

    // Necesitamos un método que reciba un array y lo sume
    public static <T extends Number> double sumar(T[] elArrayDeValores){
        double resultadoSuma = 0;
        for(T valor : elArrayDeValores){
            resultadoSuma = resultadoSuma + valor.doubleValue();
        };

        return resultadoSuma;
    }

    // Método genérico que devuelva el valor máximo del Array
    public static <T extends Comparable<T>> T devuelveMaximoArray(T[] elArrayDeMaximos){
        T valorMaximo = elArrayDeMaximos[0];
        for (T valor : elArrayDeMaximos){
            if (valor.compareTo(valorMaximo) > 0) {
                valorMaximo = valor;
            }else if (valor.compareTo(valorMaximo) < 0){
            }
        }

        return valorMaximo;
    }
}
