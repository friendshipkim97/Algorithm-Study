package com.lecture.dfsbfsapplication;

import java.util.Scanner;

public class PermutationSolution {

    static int[] pm, ch, arr;
    static int n, m;

    private void dfs(int L) {
        if (L == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        }
        else{
            for (int i = 0; i < n; i++) {
                 if(ch[i]==0){
                    ch[i]=1;
                    pm[L] = arr[i];
                    dfs(L+1);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        PermutationSolution permutationSolution = new PermutationSolution();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = kb.nextInt();
        ch = new int[n];
        pm = new int[m];
        permutationSolution.dfs(0);
    }

}
