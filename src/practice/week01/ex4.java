package practice.week01;

import java.io.*;

public class ex4 {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");
        System.out.print("n 의값 : "); int n = Integer.parseInt(br.readLine());
        System.out.print("w 의값 : "); int w = Integer.parseInt(br.readLine());

        if (n % w == 0){
            for (int i = 1; i <= n/w; i++)
                System.out.println("*".repeat(w));
        }
        else System.out.println("*".repeat(n % w));


    }
}
