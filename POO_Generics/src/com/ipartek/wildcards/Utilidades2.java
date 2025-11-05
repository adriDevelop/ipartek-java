package com.ipartek.wildcards;

import java.util.List;

public class Utilidades2 {

    public static void devuelveSonidos(List<? extends Animal> listaAnimal){
        listaAnimal.forEach(Animal::emitirSonido);
    }

    public static void agregarPerros(List<? super Perro> listaPerros){
        listaPerros.add(new Perro());
    }
}
