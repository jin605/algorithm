package main.ex2;

import java.io.*;
import java.util.StringTokenizer;

public class ex4 {

    static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int t = h * 60 + m;

        System.out.print(h % 24);


    }





}
