package com.ipartek.models;

public class Gato {

    private int edad;
    private String nombre;
    private String color;

    public Gato(){

    }

    public Gato(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }

    public Gato(int edad, String nombre, String color){
        this.edad = edad;
        this.nombre = nombre;
        this.color = color;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getColor(){
        return this.color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /// ///

    public String maullar(){
        return "miau!";
    }

    public String maullar(String maullido){
        return maullido;
    }

    public String maullar(int nVeces){

        String maullidoFinal = "";

        for (int i = 1; i < nVeces; i++) {
            maullidoFinal += " miau!!";
        }

        return maullidoFinal;
    }

    /// ///

    @Override
    public String toString() {
        return "Hola soy un gato";
    }
}
