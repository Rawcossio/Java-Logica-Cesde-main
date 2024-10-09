package notasdeclase;

import java.util.Scanner;

public class While {

    static String userCreated;
    static String correoCreated;
    static String passwordCreated;
    static String userOrCorreoInput;
    static String passwordInput;
    static int salario;
    static double salarioNeto;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Presione 1 para inicializar");

        int init = sc.nextInt();



        while( init != 0) {



           System.out.println("Seleccione 1. para crear un usuario" + "\n" +
                    "Seleccione 2. Iniciar sesion" + "\n" +
                    "Seleccione 3. para calcular el salario " + "\n" +
                    "Seleccione 4 validar categoroia de salario" + "\n" +
                    "Seleccione 5. para ver datos del usuario" + "\n" +
                    "6. para salir"
            );

            int opcion = sc.nextInt();



            switch (opcion) {
                case 1:

                    System.out.println("Ingrese usuario");
                    sc.nextLine();
                    userCreated = sc.nextLine();


                    System.out.println("Ingrese correo");
                     correoCreated = sc.nextLine();

                    System.out.println("Ingrese contraseña");
                    passwordCreated = sc.nextLine();
                    break;
                case 2:
                    System.out.println("Ingrese usuario o correo");
                    sc.nextLine();
                    userOrCorreoInput = sc.nextLine();

                    System.out.println("Ingrese contraseña");
                     passwordInput = sc.nextLine();

                    if(userOrCorreoInput.equals(userCreated) || userOrCorreoInput.equals(correoCreated) && passwordInput.equals(passwordCreated)) {
                        System.out.println("Bienvenido " + userCreated );
                    } else {
                        System.out.println("Error valide credenciales");
                    }

                    break;
                case 3:
                    System.out.println("Ingrese salario");
                    salario = sc.nextInt();

                    if (salario <= 1300000) {
                         salarioNeto = salario - (salario * 0.08);
                         salarioNeto += 162000;
                    } else {
                        salarioNeto = salario - (salario * 0.08);
                    }

                    System.out.println("El salario es " + salarioNeto);

                    break;

                case 4:
                    System.out.println("Validar categorias del usuario");

                    if (salarioNeto * 2 <= 2600000 ) {
                        System.out.println("El salario es de tipo A");
                    } else if (salarioNeto <= 3500000){
                        System.out.println("El salario es de tipo B");
                    } else if (salarioNeto >= 4000000) {
                        System.out.println("El salario es de tipo C");
                    }

                    break;
                case 5:
                    System.out.println("Ver datos del usuario");
                case 6:
                    init = 0;
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
            }
        }
    }
}
