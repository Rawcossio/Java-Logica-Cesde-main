package ejercicios;

import java.util.Random;

public class RandomGame {
    public static void main(String[] args) {
        int points = 0;
        int life = 10;
        Random random = new Random();
        while (life > 0 && points < 20) {
            //int num = (int) (Math.random()*10+2);
            int num = random.nextInt(10+1);

            if(num % 2 == 0) {
                points++;
                System.out.println("Tienes " + points + " puntos");
            } else {
                life--;
                System.out.println("Te quedan " + life + " vidas");
            }
        }
    }
}
