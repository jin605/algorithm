package main.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Min4 {


    static int Min4_1(int a, int b, int c, int d){
        int min = a;
        if (min > b)
            min = b;
        if (min > c)
            min = c;
        if (min > d)
            min = d;
        return min;
    }

    static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c, d;

        System.out.println("네 정수의 최솟값을 구합니다,");
        System.out.print("a값 : "); a = Integer.parseInt(br.readLine());
        System.out.print("b값 : "); b = Integer.parseInt(br.readLine());
        System.out.print("c값 : "); c = Integer.parseInt(br.readLine());
        System.out.print("d값 : "); d = Integer.parseInt(br.readLine());

        int min = Min4_1(a,b,c,d);
        System.out.println("최솟값은 " + min + "입니다.");

    }

}
