package com.ipartek.list.arraylist;

import com.ipartek.list.models.Arbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal1 {

    public static void main(String[] args) {

        List<Arbol> arboles = new ArrayList<>();

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

        Collections.sort(arboles);

        arboles.forEach(System.out::println);
    }
}
