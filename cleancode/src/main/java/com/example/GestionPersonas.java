package com.example;

import java.util.Scanner;

public class GestionPersonas {
    public static void crearPersona(){
        System.out.println("Que edad tienes");
        Scanner sc = new Scanner(System.in);
        int edad;
        edad = sc.nextInt();
        System.out.println("Cual es tu nombre");
        String nombre;
        nombre = sc.nextLine();

        Persona persona = new Persona(nombre, edad);

    }
}
