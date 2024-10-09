package notasdeclase;

import java.util.Scanner;
public class FuncionConRetorno {
    static Scanner sc = new Scanner(System.in);
    static double salario;
    static float auxTransporte = 162000;
    static double salarioNeto;
    static double descuentoSalud;
    static double descuentoPension;
    static double smlv = 1300000;
    //las constantes se declaran en mayuscula y llevan la palabra final
    static final float PORCDESCUENTOSALUD = 0.04f;
    static final float PORCDESCUENTOPENSION = 0.04f;

    public static void main(String[] args) {

        System.out.println("Ingrese salario");
        salario = sc.nextDouble();
        salarioNeto = calcularSalarioNeto(salario, PORCDESCUENTOSALUD, PORCDESCUENTOPENSION, auxTransporte);
        System.out.println("el salario neto es " + salarioNeto);
    }

    //Tuya va a pagar el salario de los nuevos developers, si el nivel del
    //junior su salario es de 2500000 y si es junior advance es de 3100000
    //Se requiere calcular los descuentos de salud y pension, si e salario es menor a dos SMLV se le debe de pagar aux de transporte
    //de lo contrario no se pagara
    //Cree una funcionalidad que permita calcular el pago a cada uno de los nuevos developers.
    //Como es una funcionalidad se requiere que funcione para 1,2,3 personas.

    public static double calcularSalud(double salario, float porcSalud) {
        return salario * porcSalud;
    }
    public static double calcularPension(double salario, float porcPension) {
        return salario * porcPension;
    }

    public static double calcularSalarioNeto(double salario, float porcSalud, float porcPension, double auxTransporte) {
        if(salario <= 2*smlv) {
            return  salario - calcularPension(salario, porcPension) - calcularSalud(salario, porcSalud) + auxTransporte;
        } else {
            return salario - calcularPension(salario, porcPension) - calcularSalud(salario, porcSalud);
        }
    }
}
