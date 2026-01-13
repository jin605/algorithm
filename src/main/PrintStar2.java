package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStar2 {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n,w = 0;
        System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");
        System.out.print(("n값 : "));
        n = Integer.parseInt(br.readLine());
        System.out.print(("w값 : "));
        w = Integer.parseInt(br.readLine());

        for (int i = 0; n/w > i; i++){
            System.out.println("*".repeat(w));
        }
        int rest = n % w;
        if (rest != 0){
            System.out.println("*".repeat(rest));
        }




    }
}
