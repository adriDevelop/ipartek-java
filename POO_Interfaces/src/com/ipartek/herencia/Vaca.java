package com.ipartek.herencia;

public class Vaca extends Mamifero{

    public void metodoVaca(){
        System.out.println("muuuuuuu!!!!");
    }

    @Override
    public void metodoMamifero() {

        System.out.println("metodoMamifero desde Vaca");
    }

    @Override
    public void metodoAnimal() {

    }
}
