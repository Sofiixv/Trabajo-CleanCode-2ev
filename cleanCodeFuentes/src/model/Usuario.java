package model;

public class Usuario {
    // public String nombre; USO INCORRECTO
    // public int edad;

    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String obtenerNombre() {
        return this.nombre.toUpperCase();
    }

    public int getEdad() {
        return edad;
    }

    

    
}
