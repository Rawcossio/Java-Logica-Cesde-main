package notasdeclase;

public class Variable {
    public static void main(String[] args) {

        int idCliente; //Declarando variable

        idCliente = 12345678; //Inicializar una variable

        String nombreCliente = "Carlos";

        int num1, num2; //Se pueden declarar variables del mismo tipo

        num1 = 20;
        num2 = 30;

        byte edad = 127;

        short mesada = 32767;
        short ahorroMesada = mesada;

        //Vamos a usar el casteo de variables

        int ahorro = (int) ahorroMesada;

        ahorro = ahorroMesada + mesada;

        System.out.println(ahorro);

        //Saque el promedio de las edades
        int edad1 = 19;
        String edad2 = "22";
        int edadConvertida = Integer.parseInt(edad2);

        float promedio = (edad1 + edadConvertida)/2;


        System.out.println(promedio);

        String                                                                                                                                                                                                                                                                                                                                                                           promedioConvertido = promedio + "";

    }
}
