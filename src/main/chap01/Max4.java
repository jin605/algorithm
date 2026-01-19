package main.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max4 {

    static int Max4methods(int a, int b, int c, int d) {
        int max = a;
        if (b > max )
            max = b;
        if (c > max )
            max = c;
        if (d > max )
            max = d;



        return max;
    }

    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c, d;

        System.out.println("네 정수 값의 최대값을 구합니다,");
        System.out.print("a값 : "); a = Integer.parseInt(br.readLine());
        System.out.print("b값 : "); b = Integer.parseInt(br.readLine());
        System.out.print("c값 : "); c = Integer.parseInt(br.readLine());
        System.out.print("d값 : "); d = Integer.parseInt(br.readLine());

        int max = Max4methods(a,b,c,d);
        System.out.println("최대값은 "+ max + "입니다.");

    }
}
