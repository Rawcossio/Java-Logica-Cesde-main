package notasdeclase;

import java.util.Scanner;

public class ArrayTres {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] nombres = new String[4];
        int sizeNombres = nombres.length;
        int i = 0;

        while( i < sizeNombres) {
            System.out.println("Ingrese el nombre " + (i + 1));
            nombres[i] = sc.nextLine();
            i++;
        }



        for (int j = 0; j < sizeNombres; j++) {
            System.out.println(nombres[j]);
        }
    }
}
