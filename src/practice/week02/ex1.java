package practice.week02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class ex1 {
    public static void swap(int[] a, int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    public static void reverse (int[] a){
        for (int i = 0; i < a.length / 2; i++){
            swap(a, i, a.length - i -1 );
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요솟수 : ");
        int n = Integer.parseInt(br.readLine());

        int[] x = new int [n];

        for (int i = 0; i < x.length; i++ ){
            System.out.print("x[" + i + "] : ");
            x[i] = Integer.parseInt(br.readLine());

        }

        reverse(x);
        System.out.println("요소를 역순으로 정렬했습니다.");
        System.out.println(" x = " + Arrays.toString(x));



    }
}