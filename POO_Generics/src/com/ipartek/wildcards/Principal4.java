package com.ipartek.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Principal4 {

    public static void main(String[] args) {

        Imprimir.imprimirMensajeSimple("Hola que tal");

        // Un wildcard es una especie de comodín y se representa con una ?
        List<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(new Persona("Pepito"));
        listaPersonas.add(new Persona("Juanito"));

        Imprimir.imprimirLista(listaPersonas);

        List<Musico> listaMusicos = new ArrayList<>();

        listaMusicos.add(new Musico("Juan Valdivia", "Guitarra"));
        listaMusicos.add(new Musico("Joaquin Cardiel", "Bajo"));

        // Si intentamos pasar una lista de músicos deduciendo que va a ser admitida
        // porque músico hereda de persona, comprobaremos que la herencia entre tipos
        // no funciona así.

        // Pero al crear un wildcard, vemos que nos deja pasarle una lista de cualquier tipo.
        Imprimir.imprimirLista(listaMusicos);
        System.out.println("============");
        Imprimir.imprimirLista(listaPersonas);
    }
}
