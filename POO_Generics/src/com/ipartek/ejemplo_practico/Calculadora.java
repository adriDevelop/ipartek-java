package com.ipartek.ejemplo_practico;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    public static double sumarNumeros(List<? extends Number> listaNumeros){
        double suma = 0d;

        for(Number numero : listaNumeros){
            suma += numero.doubleValue();
        }

        return suma;
    }

    public static <T extends Number> List<T> procesaNumeros(List<T> listaGenericos){
        List<T> listaNumerosGenericosNuevosPares = new ArrayList<>();
        listaGenericos.forEach(generico -> {
            if (generico.doubleValue()%2 == 0){
                listaNumerosGenericosNuevosPares.add(generico);
            }
        });

        return listaNumerosGenericosNuevosPares;
    }
}
