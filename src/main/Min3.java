package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Min3 {

    static int Min3_1(int a, int b, int c) {
        int min = a;
        if (min > b)
            min = b;
        if (min > c)
            min = c;

        return min;
    }

    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;

        System.out.println("세 정수 값의 최솟값을 구합니다,");
        System.out.print("a값 : "); a = Integer.parseInt(br.readLine());
        System.out.print("b값 : "); b = Integer.parseInt(br.readLine());
        System.out.print("c값 : "); c = Integer.parseInt(br.readLine());

        int max = Min3_1(a,b,c);
        System.out.println("최솟값은 "+ max + "입니다.");

    }
}