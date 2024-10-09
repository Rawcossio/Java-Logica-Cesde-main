package ejercicios;

import java.util.Scanner;

public class TiendaAlex {
    //arreglo 5x5 [5][5]
    static Scanner sc = new Scanner(System.in);
    static String[][] matrizProducto = new String[5][5];
    static String[] producto = new String[5];
    static int idProducto;
    static String nombreProducto;
    static double precio;
    static int cantidad;
    static boolean estado;

    public static void main(String[] args) {
        agregarMatrizProducto();
        listarPreciosProducto();

    }

    public static String[] crearProductos(){

        /*  for(int i = 0; i < producto.length; i++) {
            idProducto = i;

            System.out.println("Ingrese nombre del producto");
            nombreProducto = sc.nextLine();

            System.out.println("Ingrese cantidad");
            cantidad = sc.nextInt();

            System.out.println("Ingrese precio");
            precio = sc.nextInt();

            estado = true;

        } */



        System.out.println("ingrese el id del producto");
        idProducto = sc.nextInt();
        producto[0] = idProducto + "";
        sc.nextLine();

        System.out.println("Ingrese nombre del producto");
        nombreProducto = sc.nextLine();
        producto[1] = nombreProducto;

        System.out.println("Ingresa precio");
        precio = sc.nextDouble();
        producto[2] = precio + "";


        System.out.println("Ingrese la cantidad");
        cantidad = sc.nextInt();
        producto[3] = cantidad + "";

        estado = true;
        producto[4] = estado + "";

        return producto;
    }

    public static void agregarMatrizProducto() {
        int i = 0;
        while (i < matrizProducto.length){
            matrizProducto[i] = crearProductos();
            i++;
        }
    }

    public static void listarPreciosProducto() {
        for(int i = 0; i < matrizProducto.length; i++) {
            for(int j = 0; j < matrizProducto[i].length; j++) {
                System.out.print(matrizProducto[i][j]);
                System.out.println("\n");
            }
        }
    }

}