package com.ipartek.clases_genericas;

public class Principal2 {

    public static void main(String[] args) {

        Caja caja = new Caja("hola");

        CajaGenerica<String> laCajaGenerica = new CajaGenerica<>("Que tal");
    }
}
