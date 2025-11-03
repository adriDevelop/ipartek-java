package com.ipartek.estatico.models;

public class Usuario {

    // Este atributo pertenece al contexto no estático. Es decir, pertenece a las instancias de su clase.
    private String nombre;
    private String password;

    // Este atributo pertenece al contexto estático. Pertenece a la clase.
    private static Integer numeroUsuarios = 0;

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
        numeroUsuarios++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Integer getNumeroUsuarios() {
        return numeroUsuarios;
    }

    public static void setNumeroUsuarios(Integer numeroUsuarios) {
        Usuario.numeroUsuarios = numeroUsuarios;
    }

    public void metodoNoStatic(){
        // Desde el contexto no estático, tenemos acceso al contexto estático.
        metodoStatic();
    }

    public static void metodoStatic(){
        // Desde el contexto estático no es posible. No tenemos acceso al contexto no estático.
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " - Password: " + this.password;
    }
}
