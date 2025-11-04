package com.ipartek.metodos_genericos;

public class Gato implements Comparable<Gato>{

    private String nombre;
    private Integer edad;

    public Gato(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Gato: " + this.nombre + " con edad: " + this.edad;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Gato gato) {
        if (this.nombre.compareTo(gato.getNombre()) > 0){
            return 1;
        }else if (this.nombre.compareTo(gato.getNombre()) < 0){
            return -1;
        }else {
            return 0;
        }
    }
}
