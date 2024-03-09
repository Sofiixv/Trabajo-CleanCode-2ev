package model;

import exceptions.EdadNotValid;

public class OperacionesUsuario {
//     public static String obtenerNombreUsuario(Usuario usuario) {
//         return usuario.nombre.toUpperCase(); USO INCORRECTO
// }



public static String obtenerNombre(Usuario usuario) {
    return usuario.obtenerNombre();
}

public static boolean validarEdad(int edad) throws EdadNotValid{
    // if (edad>=18) {
    //     return true;
    // }
    // return false;

    if (edad<18) {
        throw new EdadNotValid("La edad no es valida");
    }

    return true;

    // if (edad>=18) {
    //     return 1;
    //  }
    //  return -1;

 }
}
