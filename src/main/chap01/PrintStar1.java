package main.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStar1 {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n,w = 0;
        System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");
        System.out.print(("n값 : "));
        n = Integer.parseInt(br.readLine());
        System.out.print(("w값 : "));
        w = Integer.parseInt(br.readLine());

       for (int i = 0; n > i; i++) {
           System.out.print("*");
           if (i % w == w - 1)
             System.out.println();
       }
       if (n % w != 0)
           System.out.println();


    }
}
