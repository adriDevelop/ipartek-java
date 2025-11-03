package com.ipartek.estatico.models;

public class Animal {

    // Este método no es polimórfico al ser static, por lo tanto, no se puede sobreescribir desde una subclase.
    public static void metodoAnimalStatic(){
        System.out.println("Soy un animal");
    }

    // Este método es polimórfico y se puede sobreescribir desde una subclase.
    public void metodoAnimal(){
        System.out.println("Soy un animal");
    }


}
