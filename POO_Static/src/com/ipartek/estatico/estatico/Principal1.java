package com.ipartek.estatico.estatico;

import com.ipartek.estatico.models.SubUsuario;
import com.ipartek.estatico.models.Usuario;

public class Principal1 {

    public static void main(String[] args) {

        // Los métodos estáticos se heredan? NO. Los métodos estáticos no se heredan.
        // Sin embargo, si se pueden ocultar y son accesibles desde las subclases, pero, no se pueden sobreescribir.

        // En Java los métodos static pertenecen a la clase, no a las instancias.
        // 1) No participan en el polimorfismo.
        // 2) No se sobreescriben sino que se ocultan.

        Usuario agustin = new Usuario("Agustín", "admin");
        Usuario enrique = new Usuario("Enrique", "abc");

        SubUsuario subEnrique = new SubUsuario("SubEnrique", "subadmin");

        // Desde la subclase tengo acceso a los atributos y métodos estáticos de la superclase.
        SubUsuario.getNumeroUsuarios();
    }
}
