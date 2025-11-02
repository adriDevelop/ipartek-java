package com.ipartek.objetos_inmutables;

public class Principal4 {

    public static void miMetodo(String s){
        s = "otro nombre";
        System.out.println(s);
    }

    public static void main(String[] args) {
        String nombre = "Adrian";
        miMetodo(nombre);
        System.out.println(nombre);
    }
}
