package com.ipartek.introduccion;

public class Principal1 {

    public static void main(String[] args) {
        MiClase miObjeto = new MiClase();
        Object miObjeto2 = new MiClase();
        MiInterface<String> miObjeto3 = new MiClase();

        MiClase2 miOtroObjeto = new MiClase2();
        Object miOtroObjeto2 = new MiClase2();

        // Puedo crear un objeto de tipo MiInterface<String> sin necesidad de una clase implementadora
        // como en el caso de MiClase?
        MiInterface<String> miOtroObjeto3 = (palabra )->{
            System.out.println(palabra);
        };

        Calculadora<Integer, Double> miCalculadora = (numero1, numero2) -> {
            System.out.println((double) numero1+numero2);
            return (double) numero1+numero2;
        };

        miObjeto.miMetodoPropio();
        miObjeto.miMetodo("Hola desde mi método del Objeto MiClase");
        miObjeto3.miMetodo("Hola desde mi método del Objeto MiInterface String");
        miOtroObjeto3.miMetodo("Hola buenos dias");
        miCalculadora.sumaValores(4, 8);

    }
}
