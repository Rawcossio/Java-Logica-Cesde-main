package ejercicios;


import java.util.Scanner;

public class EdadesPromedioEdad {
    static int sumEdades;
    static int sumEdadesPrueba;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int edades[] = new int[5];

        int i = 0;
        int j = 0;


        //Almacenando
        while(i < edades.length) {
            System.out.println("Ingrese la edad #" + (i + 1));
            edades[i] = sc.nextInt();
            //sumEdades += edades[i];
            i++;
        }

        while(j < edades.length) {
            sumEdadesPrueba += edades[j];
            j++;
        }

        //System.out.println("Promedio suma prueba" + sumEdadesPrueba);

        int promEdades = (sumEdadesPrueba/edades.length);

        System.out.println(promEdades);
    }
}
