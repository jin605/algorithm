package practice.week01;

import java.io.*;

public class ex3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;

            if(i != n) {
                System.out.print(i + " + ");
            }
            else {
                System.out.print(i + " = " + sum);

            }
        }




    }
}
