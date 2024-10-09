package notasdeclase;

import java.util.Scanner;

public class Condicional {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //if es una estructura condicional, valida que se cumple una condicion.

        //declarado de manera global
        double balance = 170000;



        System.out.println("Ingrese el valor de la compra");
        double purchase = sc.nextDouble();

        System.out.println("Numero de cuotas");
        int quotas = sc.nextInt();

        if(purchase > 0 && balance >= (purchase / quotas) ) {
            System.out.println("Compra exitosa");
            balance -= (purchase / quotas);
            System.out.println("Su nuevo saldo es: " + balance);
        } else if (purchase <= 0) {
            System.out.println("Debe de ingresar una compra con valor valido");
        } else {
            System.out.println("Fondos insuficientes");
        }

    }

}
