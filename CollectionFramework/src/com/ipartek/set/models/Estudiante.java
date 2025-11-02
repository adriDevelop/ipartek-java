package com.ipartek.set.models;

import java.util.Objects;

public class Estudiante implements Comparable<Estudiante>{

    private String nombre;
    private Integer edad;
    private String ciudad;

    public Estudiante(String nombre, Integer edad, String ciudad){
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ciudad='" + ciudad + '\'';
    }

    @Override
    public int compareTo(Estudiante estudiante) {

        int resultado = this.edad - estudiante.edad;

        if (resultado == 0 && !this.equals(estudiante)){
            return 1;
        }

        return resultado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(edad, that.edad) && Objects.equals(ciudad, that.ciudad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, ciudad);
    }
}
