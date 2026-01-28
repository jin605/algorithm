package practice.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex4 {

    static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("첫 번째 수 > ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("두 번째 수 > ");
        int b = Integer.parseInt(br.readLine());

        System.out.print("연산자 입력(+, -, *, /) > ");
        String c = br.readLine();

        if (c.equals("+")){
            System.out.printf("a + b = %d",a+b);
        } else if (c.equals("-")){
            System.out.printf("a - b = %d",a-b);
        } else if (c.equals("*")){
            System.out.printf("a * b = %d",a*b);
        } else if (c.equals("/")){
            System.out.printf("a / b = %d",a/b);
        } else {
            System.out.println("연산자를 잘못 입력하셨습니다.");
        }




    }
}
