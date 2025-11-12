package com.ipartek.models;

import java.util.List;

public class Alumno2 {

    private String nombre;
    private List<Double> notas;
    private Double notaMedia;
    private String estadoExpediente;

    public Alumno2() {
    }

    public Alumno2(String nombre, List<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public Double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(Double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String getEstadoExpediente() {
        return estadoExpediente;
    }

    public void setEstadoExpediente(String estadoExpediente) {
        this.estadoExpediente = estadoExpediente;
    }

    @Override
    public String toString() {
        return "Alumno " + this.nombre + " tiene las notas " + this.notas + " y su expediente se encuentra "
                + this.estadoExpediente;
    }
}
