package main.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Median {
    static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (c >= a)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (c > b)
            return b;
        else return c;

    }

    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a 값 : ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("b 값 : ");
        int b = Integer.parseInt(br.readLine());
        System.out.print("c 값 : ");
        int c = Integer.parseInt(br.readLine());

        System.out.println("중앙값은 " + med3(a, b, c) + " 입니다.");

    }
}
