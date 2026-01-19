package main.chap02;

import java.io.*;
import java.util.Random;

public class MaxOfArrayRandom {
    public static int maxOf (int[] a){
        int max = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] > max) max = a[i];
        }
        return max ;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random rand = new Random();

        System.out.println("키의 최대값을 구합니다.");
        System.out.print("사람 수 : ");
        int n = Integer.parseInt(br.readLine());

        int height[] = new int[n];

        System.out.println("킷값은 다음과 같습니다.");

        for (int i = 0; i < n; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "]: " + height[i]);
        }
        System.out.println("최대값은 " + maxOf(height) + "입니다.");


    }
}
