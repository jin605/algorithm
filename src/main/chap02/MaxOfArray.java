package main.chap02;

import java.io.*;
public class MaxOfArray {

    static int MaxOf(int[] a){
            int max = a[0];
            for (int i = 1; i < a.length ;i++)
                if(a[i] > max ) max = a[i];
            return max;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("키의 최대값을 구합니다.");
        System.out.print("사람 수 : ");
        int N = Integer.parseInt(br.readLine());

        int[] height = new int[N];

        for (int i = 1; i < N; i++) {
            System.out.print("height[" + i + "] : " );
            height[i] = Integer.parseInt(br.readLine());

        }

        System.out.println("최대값은 " + MaxOf(height) + "입니다");



    }
}
