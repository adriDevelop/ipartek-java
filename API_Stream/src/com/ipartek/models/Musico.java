package com.ipartek.models;

public class Musico {
    private String nombre;
    private String apellidos;
    private Integer id;
    private static Integer numeroMusicos = 0;

    public Musico(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;

        this.id = ++numeroMusicos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Id músico " + this.id + " Músico nombre " + nombre + " apellidos " + apellidos;
    }
}
