package ejercicios;

import java.util.Scanner;

public class RegistroFormulario {
    public static void main(String[] args) {
        //id, nombre, correo, contraseña, edad, estatura, genero, estado: true

        //Creando instancia de la clase de java Scanner;
        Scanner leer = new Scanner(System.in);

        boolean estado = true;

        System.out.println("Ingrese cedula");
        int id = leer.nextInt();
        leer.nextLine();

        System.out.print("Ingrese nombre");
        String nombre = leer.nextLine();

        System.out.println("Ingrese correo");
        String correo = leer.nextLine();

        System.out.println("Ingrese contraseña");
        String contrasena = leer.nextLine();

        System.out.println("Ingrese edad");
        int edad = leer.nextInt();

        System.out.println("Ingrese estatura");
        float estatura = leer.nextFloat();
        leer.nextLine();

        System.out.println("Ingreso genero (M: masculino o F: femenino)");
        String genero = leer.nextLine();

        System.out.println("nombre: " + nombre + "\n" +
                    "cedula: " + id + "\n" +
                    "correo: " + correo + "\n" +
                    "contraseña: " + contrasena + "\n" +
                    "edad: " + edad + "\n" +
                    "estatura: " + estatura + "\n" +
                    "genero: " + genero + "\n" +
                    "estado: " + estado + "\n"
                );

    }
}
