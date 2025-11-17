package com.ipartek.anymatch_allmatch_nonematch;

import com.ipartek.models.Arbol;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Principal11 {

    public static void main(String[] args) {

        // Anymatch
        // Es un operador terminal-predicado
        // Comprueba si existe alguna coincidencia

        List<String> bosque = new ArrayList<>();
        bosque.add("Roble-Europa");
        bosque.add("Abeto-America");
        bosque.add("Cerezo-Asia");
        bosque.add("Naranjo-Asia");
        bosque.add("Baobab-Africa");

        // Mapear los objetos String del ArrayList "bosque" en un ArrayList<Arbol> (bosque2)

        List<Arbol> bosque2 = bosque.stream()
                .map(s -> new Arbol(s.split("-")[0], s.split("-")[1]))
                .toList();

        // Hay algun naranjo
        boolean hayNaranjo = bosque2.stream()
                .anyMatch(a -> a.getNombre().equals("Naranjo"));

        System.out.println("hayNaranjo = " + (hayNaranjo? "si": "no"));

        // AllMatch
        // Es un operador terminal-predicado
        // Comprueba si todas son coincidencias

        // ¿Son todos los árboles de bosque2 procedentes de América?
        boolean sonDeAmerica = bosque2.stream()
                .allMatch(a -> a.getOrigen().equals("America"));

        System.out.println("sonDeAmerica = " + (sonDeAmerica ? "si": "no"));

        // NoneMatch
        // Es un operador terminal-predicado
        // Comprueba si no hay ninguna coincidencia

        // Hay alguno de Oceania
        boolean ningunoDeOceania = bosque2.stream()
                .noneMatch(a -> a.getOrigen().equals("Oceania"));

        System.out.println("ningunoDeOceania = " + (ningunoDeOceania ? "si": "no"));
    }
}
