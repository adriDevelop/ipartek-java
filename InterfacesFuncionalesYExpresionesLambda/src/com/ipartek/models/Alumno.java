package com.ipartek.models;

public class Alumno {

    private String nombre;
    private Double notaMatematicas;
    private Double notaFisica;

    public Alumno() {
    }

    public Alumno(String nombre, Double notaMatematicas, Double notaFisica) {
        this.nombre = nombre;
        this.notaMatematicas = notaMatematicas;
        this.notaFisica = notaFisica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(Double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public Double getNotaFisica() {
        return notaFisica;
    }

    public void setNotaFisica(Double notaFisica) {
        this.notaFisica = notaFisica;
    }

    @Override
    public String toString() {
        return "Alumno " + this.nombre + " tiene las notas de matemáticas " + this.notaMatematicas + " nota física" +
                this.notaFisica;
    }
}
