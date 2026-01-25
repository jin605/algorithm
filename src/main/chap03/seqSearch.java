package main.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class seqSearch {

    static int seqSearch (int[] a , int n, int key){
        int i = 0;

        while(true){
            if (i == n)
                return -1;
            if (a[i] == key )
                return i;
            i++;

        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요솟수 : ");
        int num = Integer.parseInt(br.readLine());

        int[] x = new int[num];

        for (int i = 0; i < x.length; i++){
            System.out.printf("x[%d] : ",i);
            x[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("검색할 값 : ");
        int key = Integer.parseInt(br.readLine());

        int idx = seqSearch(x, num,key);

        if (idx == -1){
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.printf("그 값은 x[%d]에 있습니다.",idx);
        }


    }
}
