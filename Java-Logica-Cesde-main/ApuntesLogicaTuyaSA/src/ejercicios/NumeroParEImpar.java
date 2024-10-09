package ejercicios;

public class NumeroParEImpar {
    public static void main(String[] main) {
        int i = 0;

        while(i <= 100){
            if(i % 2 == 0 ) {
                System.out.println(i + "es par");
            } else if (i % 2 == 1) {
                System.out.println(i + "es impar");
            }
            i++;
        }
    }
}
