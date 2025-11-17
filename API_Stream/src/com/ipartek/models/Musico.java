package com.ipartek.models;

import java.util.Objects;

public class Musico implements Comparable<Musico>{
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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Musico musico = (Musico) o;
        return Objects.equals(nombre, musico.nombre) && Objects.equals(apellidos, musico.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos);
    }

    @Override
    public int compareTo(Musico musico) {
        // Vamos a ordenar los objetos de la clase Músico por apellido
        int resultado = this.apellidos.compareTo(musico.getApellidos());
        if (resultado == 0 && !this.equals(musico)){
            return 1;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Id músico " + this.id + " Músico nombre " + nombre + " apellidos " + apellidos;
    }
}
