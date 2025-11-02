package com.ipartek.set.linkedhashset;

import com.ipartek.list.models.Arbol;

import java.util.LinkedHashSet;
import java.util.Set;

public class Principal4 {

    public static void main(String[] args) {

        // Los LinkedHashSet, como todos los sets, no admiten duplicados
        // pero a diferencia de los HashSet almacenan los elementos ordenadamente
        // siguiendo el orden natural de entrada.
        // pero no podemos hacer un post-ordenamiento como hacemos con los Lists.

        Set<Arbol> arboles = new LinkedHashSet<>();

        arboles.add(new Arbol("Fresno", 13D));
        arboles.add(new Arbol("Roble", 10D));
        arboles.add(new Arbol("Fresno", 13D));
        arboles.add(new Arbol("Nogal", 9D));
        arboles.add(new Arbol("Nogal", 11D));
        arboles.add(new Arbol("Cerezo", 13D));
        arboles.add(new Arbol("Cerezo", 8D));
        arboles.add(new Arbol("Almendro", 3D));
        arboles.add(new Arbol("Limonero", 4D));
        arboles.add(new Arbol("Limonero", 7D));

        arboles.forEach(System.out::println);


    }
}
