package notasdeclase;
import java.util.Scanner;
public class Switch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Seleccione 1. para crear un usuario" + "\n" +
                "Seleccione 2. Iniciar sesion" + "\n" +
                "Seleccione 3. para calcular el salario " + "\n" +
                "Seleccione 4 validar categoroia de salario" + "\n" +
                "Seleccione 5. para ver datos del usuario" + "\n" +
                "Seleccione 6 para salir"
                );

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Crear usuario");

                break;
            case 2:
                System.out.println("Iniciar sesion");
                break;
            case 3:
                System.out.println("calcular salario");
            case 4:
                System.out.println("Validar categorias del usuario");
                break;
            case 5:
                System.out.println("Ver datos del usuario");
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        }


    }
}
