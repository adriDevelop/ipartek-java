package com.ipartek.interfaces_genericas;

public class MiClase implements MiInterface {
    @Override
    public String metodo1(String s) {
        return "hola";
    }

    @Override
    public Boolean metodo2(Integer a, Integer b) {
        return true;
    }
}
