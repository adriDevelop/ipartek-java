package com.ipartek.set.treeset_ordenar_datos;

import java.util.*;

public class Principal8 {

    public static void main(String[] args) {

        // Recibimos de una BBDD un ArrayList con datos y queremos limpiarlo de duplicados y ordenarlo en orden
        // alfabético en una sola operación.
        List<String> datos = new ArrayList<>();

        datos.add("Liverpool");
        datos.add("Sevilla CF");
        datos.add("Manchester UD");
        datos.add("Real Celta de Vigo");
        datos.add("Real Madrid");
        datos.add("Real Betis Balonpié");
        datos.add("Liverpool");
        datos.add("Liverpool");
        datos.add("Sevilla CF");
        datos.add("Manchester UD");
        datos.add("Real Madrid");

        Set<String> equiposOrdenados = new TreeSet<>(datos);

        equiposOrdenados.forEach(System.out::println);
    }
}
