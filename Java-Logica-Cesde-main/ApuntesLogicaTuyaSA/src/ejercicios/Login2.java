package ejercicios;

import java.util.Scanner;

public class Login2 {
    //Incio sesion con telefono o email, con la clave puede iniciar sesion.
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String correo = "carlosf@gmail.com";
        int pass = 1234;
        //Un telefono puede ser de tipo string
        String num = "3015043807";


        //Interfaz
        System.out.println("Ingrese el correo o telefono");
        String input = sc.nextLine();

        System.out.println("Ingrese la contraseña");
        int passInput = sc.nextInt();

        sc.close();

        if(input.equals(correo) || input.equals(num) && passInput == pass) {
            System.out.println("Bienvenido: " + "Carlos");
        } else {
            System.out.println("Valide credenciales");
        }


    }
}
