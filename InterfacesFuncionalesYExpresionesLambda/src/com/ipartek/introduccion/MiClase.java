package com.ipartek.introduccion;

public class MiClase implements MiInterface<String>{

    public void miMetodoPropio(){
        System.out.println("Hola soy el método propio de MiClase");
    }

    @Override
    public void miMetodo(String s) {
        System.out.println(s);
    }
}
