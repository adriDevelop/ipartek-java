package com.ipartek.estatico.models;

public class Gato extends Animal{


    public static void metodoAnimalStatic() {
        System.out.println("Soy un gato");
    }

    @Override
    public void metodoAnimal() {
        System.out.println("Soy un gato");
    }
}
