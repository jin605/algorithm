package main.ex2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class ex3 {

    public static int maxOf(int[] a){
        int max = a[0];
        for (int i = 0; i <a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("키의 최대 값을 구합니다");
        System.out.print("사람 수 : ");
        int n = Integer.parseInt(br.readLine());

        int[] height = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("height[" + i +"] : ");
            height[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("최댓값은 " + maxOf(height) + "입니다.");



    }
}
