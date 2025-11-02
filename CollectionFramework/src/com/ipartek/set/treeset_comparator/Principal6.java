package com.ipartek.set.treeset_comparator;

import com.ipartek.set.models.Estudiante;
import com.ipartek.set.treeset_comparator.comparadores.OrdenarPorCiudad;

import java.util.Set;
import java.util.TreeSet;

public class Principal6 {

    public static void main(String[] args) {

//        Set<Estudiante> colegio = new TreeSet<>();
        Set<Estudiante> colegio = new TreeSet<>(new OrdenarPorCiudad());

        colegio.add(new Estudiante("Pepe", 34, "Bilbao"));
        colegio.add(new Estudiante("Julia", 23, "Burgos"));
        colegio.add(new Estudiante("Antonio", 24, "Zaragoza"));
        colegio.add(new Estudiante("Julia", 14, "Zaragoza"));
        colegio.add(new Estudiante("Julia", 14, "Zaragoza"));
        colegio.add(new Estudiante("Álvaro", 14, "Murcia"));
        colegio.add(new Estudiante("Álvaro", 14, "Murcia"));

        colegio.forEach(System.out::println);


    }
}
