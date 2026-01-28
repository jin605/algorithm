package practice.week03;

import java.util.Random;

public class ex2 {

    static void main(String[] args) {
       Random rand = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3d",rand.nextInt(9));
            }
            System.out.println();

            
        }
    }
}
