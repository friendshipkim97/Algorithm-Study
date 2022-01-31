package com.boj.step.numbertheoryandcombinationtheory;

import java.io.*;
import java.util.StringTokenizer;

public class P2609 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int input1 = Integer.parseInt(st.nextToken());
        int input2 = Integer.parseInt(st.nextToken());

        int max = Math.max(input1, input2);
        int maxDivisor = 0;

        for (int i = 2; i <= max; i++) {
            if((input1%i==0)&&(input2%i==0)){
                maxDivisor = i;
            }
        }

        if (maxDivisor == 0) {
            bw.write(String.valueOf(1));
            bw.newLine();
            bw.write(String.valueOf(input1*input2));
        } else {
            bw.write(String.valueOf(maxDivisor));
            bw.newLine();
            bw.write(String.valueOf(maxDivisor*(input1/maxDivisor)*(input2/maxDivisor)));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
