package notasdeclase;


import java.util.Scanner;
public class Funcion {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String [] prendas = new String[5];
        String [] preferencia = new String[5]; //Me gusta, no me gusta.


        int init = 1;

        while(init != 0) {
            System.out.println("Que desea realizar 1) guardar prenda 2) recorrer prendas 3) guardar preferencias 4) recorrer preferencias 5) listar preferencias con un for each 6) salir");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    guardarPrendas(prendas);
                    break;
                case 2:
                    recorrerPrendas(prendas);
                    break;
                case 3:
                    guardarPreferenciasPrendas(preferencia, prendas);
                    break;
                case 4:
                    recorrerPreferencias(preferencia, prendas);
                    break;
                case 5:
                    listarPreferenciasConForEach(preferencia);
                    break;
                case 6:
                    init = 0;
                    break;
                default:
                    System.out.println("Escoja una opcion valida");

            }
        }


    }
    public static void guardarPrendas(String[] prendas) {

            int numPrenda = 0;
            while(numPrenda < prendas.length) {
                System.out.println("Ingrese la prenda " + (numPrenda + 1));
                prendas[numPrenda] = sc.nextLine();
                numPrenda++;
            }
    }

    public static void recorrerPrendas(String[] prendas) {
        for (int i = 0; i < prendas.length; i++) {
            System.out.println(prendas[i]);
        }
    }

    public static void guardarPreferenciasPrendas(String[] preferenciaPrenda, String[] prenda) {
        for(int i = 0; i < preferenciaPrenda.length; i++) {
            System.out.println("Ingrese ME GUSTA  o NO ME GUSTA Prenda: " + prenda[i]);
            preferenciaPrenda[i] = sc.nextLine();
        }
    }

    public static void recorrerPreferencias(String[] preferenciaPrenda, String[] prenda) {
       for(int i = 0; i < preferenciaPrenda.length; i++) {
           System.out.println( prenda[i] + ": " + preferenciaPrenda[i]);
       }
    }

    public static void listarPreferenciasConForEach(String[] preferencias) {
        for(String item: preferencias) {
            System.out.println(item);
        }
    }

}


