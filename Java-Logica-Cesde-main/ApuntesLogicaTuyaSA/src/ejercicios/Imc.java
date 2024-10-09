package ejercicios;

import java.util.Scanner;

public class Imc {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        float estature;
        float weight;
        float bodyMassIndex;

        System.out.println("Ingrese estatura");
        estature = sc.nextFloat();

        System.out.println("Ingrese peso en kg");
        weight = sc.nextFloat();

        bodyMassIndex = weight / (estature * estature);

        System.out.println("El indice de masa corporal es: " + bodyMassIndex);

        if(bodyMassIndex < 18.5 ) {
            System.out.println("Se encuentra en bajo peso");
        } else if(bodyMassIndex >= 18.5 || bodyMassIndex <= 24.9 ) {
            System.out.print("Se encuentra en un peso saludable");
        } else if(bodyMassIndex >= 25.0 || bodyMassIndex <= 29.9) {
                System.out.print("Se encuentra en sobrepeso");
        } else {
            System.out.print("Cuidado, se encuentra obeso");
        }

    }
}
