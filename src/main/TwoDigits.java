package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDigits {
    static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int no;

        System.out.println("2자리의 양수를 입력하세요.");
        do {
            System.out.print("no 값 : ");
            no = Integer.parseInt(br.readLine());
        } while (no < 10 || no > 99);

        System.out.println("변수 no값은 " + no + "이 되었습니다.");

    }

}
