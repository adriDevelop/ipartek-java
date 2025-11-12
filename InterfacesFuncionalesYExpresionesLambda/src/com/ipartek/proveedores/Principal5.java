package com.ipartek.proveedores;

import com.ipartek.models.Usuario;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.function.Supplier;

public class Principal5 {

    public static void main(String[] args) {

        // Supplier

        // Necesito una función que cree un usuario y lo devuelva
        Supplier<Usuario> creaUsuario = () -> new Usuario();
        Usuario elUsuario = creaUsuario.get();

        System.out.println(elUsuario);

        // Necesito una función que me devuelva la fecha actual (utilizando la API Time)
        Supplier<LocalDateTime> devuelveFecha = () -> LocalDateTime.now();
        LocalDateTime fecha = devuelveFecha.get();

        System.out.println(fecha);
    }
}
