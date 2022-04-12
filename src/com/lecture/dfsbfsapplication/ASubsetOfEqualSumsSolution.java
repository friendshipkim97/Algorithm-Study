package com.lecture.dfsbfsapplication;

import java.util.Scanner;

public class ASubsetOfEqualSumsSolution {

    static String answer="NO";
    static int n, total=0;
    boolean flag = false;

    public void DFS(int L, int sum, int[] arr) {
        if(flag) return;
        if(sum>total/2) return;
        if (L == n) {
            if((total-sum)==sum){
                answer="YES";
                flag = true;
            }
        }
        else{
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        ASubsetOfEqualSumsSolution aSubsetOfEqualSumsSolution = new ASubsetOfEqualSumsSolution();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            total+=arr[i];
        }
        aSubsetOfEqualSumsSolution.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
