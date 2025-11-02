package com.ipartek.set.hashset;

import com.ipartek.set.models.Personaje;
import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Principal3 {

    public static void main(String[] args) {

        // HashSet como todos los set, no admiten duplicados.
        // Almacenan los datos de manera aleatoria,
        // es decir, o se almacenan según un orden de entrada.



        // Con una clase genérica del JDK.
        Set<String> personajes = new HashSet<>();

        personajes.add("Elfo");
        personajes.add("Elfo");
        personajes.add("Hobbit");
        personajes.add("Humano");
        personajes.add("Enano");
        personajes.add("Orco");
        personajes.add("Orco");
        personajes.add("Goblin");
        personajes.add("Mago");
        personajes.add("Dragón");

        // Al contrario que un array List, el orden de inserción es aleatorio.
        personajes.forEach(System.out::println);

        // La única manera de ordenar un Set es conviertiendolo en un List.
        List<String> personajesList = new ArrayList<>(personajes);
        personajesList.sort(Comparator.reverseOrder());

        System.out.println("========================");
        personajesList.forEach(System.out::println);

        Set<Personaje> personajes2 = new HashSet<>();
        personajes2.add(new Personaje("Elfo", 8, 10));
        personajes2.add(new Personaje("Orco", 10, 5));
        personajes2.add(new Personaje("Orco", 5, 10));
        personajes2.add(new Personaje("Orco", 5, 10));
        personajes2.add(new Personaje("Hobbit", 5, 8));
        personajes2.add(new Personaje("Elfo", 8, 10));

        System.out.println("=========================================");

        personajes2.forEach(System.out::println);

    }
}
