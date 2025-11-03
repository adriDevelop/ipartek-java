package com.ipartek.set.buscar_duplicados;

import java.util.*;

public class Principal7 {

    public static void main(String[] args) {

        // Recibimos de una base de datos un Array con nombres de ciudades
        // Sacar por consola separadamente las ciudades repetidas y las no repetidas.
        String[] ciudades = {"Bilbao", "Bilbao", "Barcelona", "Bilbao", "Madrid", "Valencia", "Sevilla", "Madrid", "Salamanca", "Santander", "Bilbao"};

        // Devolvemos por consola los dos listados que devuelven los duplicados y otro con los no duplicados.
        Set<String> ciudadesDuplicadas = new HashSet<>();
        Set<String> ciudadesNoDuplicadas = new HashSet<>();

        for(String ciudad: ciudades){
            if (!ciudadesNoDuplicadas.add(ciudad)){
                ciudadesDuplicadas.add(ciudad);
            }
        }

        ciudadesDuplicadas.forEach(ciudad -> {
            ciudadesNoDuplicadas.remove(ciudad);
        });

        System.out.println("Ciudades duplicadas");
        ciudadesDuplicadas.forEach(System.out::println);
        System.out.println("Ciudades no duplicadas");



        ciudadesNoDuplicadas.forEach(System.out::println);


    }
}
