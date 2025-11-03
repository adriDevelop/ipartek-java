package com.ipartek.estatico.ocultamiento;

import com.ipartek.estatico.models.Animal;
import com.ipartek.estatico.models.Gato;

public class Principal2 {

    public static void main(String[] args) {

        Animal.metodoAnimalStatic();

        Gato.metodoAnimalStatic();

        Animal animal = new Animal();
        Animal gatoDisfrazadoDeAnimal = new Gato();
        Gato gato = new Gato();

        // Esto es una pésima práctica pero es la única forma de observar qué método estamos llamando en ambos casos.
        animal.metodoAnimalStatic();
        gatoDisfrazadoDeAnimal.metodoAnimalStatic();
        gato.metodoAnimalStatic();
    }
}
