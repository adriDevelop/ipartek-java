package com.ipartek.ejemplo_practico;

import java.util.ArrayList;
import java.util.List;

public class Principal7 {

    public static void main(String[] args) {

        // Queremos crear una clase que sea capaz de:
        // 1) Leer números de una lista. Cualquier subtipo de number.
        // 2) Escribir números en otra lista que acepte subtipos de number.
        // 3) Devolver List genéricos de forma segura. Fuertemente tipada.

        List<Double> listaGenerica = new ArrayList<>();
        listaGenerica.add(4d);
        listaGenerica.add(332.93d);
        listaGenerica.add(421.91d);
        listaGenerica.add(8d);

        List<Double> listaGenericaPares = Calculadora.procesaNumeros(listaGenerica);
        listaGenericaPares.forEach(System.out::println);

    }
}
