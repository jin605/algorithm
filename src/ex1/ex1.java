package ex1;

import java.io.*;

public class ex1 {
    static int med3 (int A, int B, int C){
        if (A >= B){
            if (B >= C)
                return B;
            else if (C > A)
                return  A;
            else return C;
        }
        else {
                if (B < C)
                    return B;
                else if (C < A)
                    return A;
                else return C;
        }
    }

    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("세 정수의 중앙값을 구합니다.");

        System.out.print("a의 값 : "); int a = Integer.parseInt(br.readLine());
        System.out.print("b의 값 : "); int b = Integer.parseInt(br.readLine());
        System.out.print("c의 값 : "); int c = Integer.parseInt(br.readLine());

        System.out.println("중앙값은 " + med3(a,b,c) + "입니다.");

    }

}
//static int med3(int a, int b, int c) {
//    if ((b >= a && c <= a) || (b <= a && c >= a)) return a;
//    else if ((a > b && c < b) || (a < b && c > b)) return b;
//    return c;


