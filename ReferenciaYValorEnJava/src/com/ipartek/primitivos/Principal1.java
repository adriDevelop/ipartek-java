package com.ipartek.primitivos;

public class Principal1 {

    public static void miMetodo(int num){
        num = 200;
        System.out.println(num);
    }

    public static void main(String[] args) {
        int miVariable = 10;
        miMetodo(miVariable);
        System.out.printf("Mi variable despues de la llamada al método %d", miVariable);
    }
}
