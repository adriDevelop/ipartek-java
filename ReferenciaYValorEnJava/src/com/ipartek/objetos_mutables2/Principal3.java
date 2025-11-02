package com.ipartek.objetos_mutables2;

import java.util.ArrayList;
import java.util.List;

public class Principal3 {

    public static void miMetodo(List<Persona> lasPersonas){
        lasPersonas.add(new Persona("nueva"));
    }

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Persona persona = new Persona("Adrián");
        personas.add(persona);
        miMetodo(personas);

        personas.forEach(System.out::println);
    }
}
