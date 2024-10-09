package ejercicios;

import java.util.Scanner;

public class Login {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //No lo ve el cliente BD, Array, API, iot.
        String userName = "cf@gmail.com";
        String nameUser = "Carlos";
        int key = 1234;

        //Interfaz

        System.out.println("Ingrese su correo");

        String userInput = sc.nextLine();

        System.out.println("Ingrese su password");
        int userKey = sc.nextInt();

        if(userName.equals(userInput) && key == userKey) {
            System.out.println("Bienvenido: " + userName);
        } else {
            System.out.println("Valide credenciales");
        }
    }
}
