package com.lecture.dfsbfsbasic;

public class RecursionFunctionSolution {

    public void DFS(int n) {
        if (n == 0) return;
        else{
            DFS(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        RecursionFunctionSolution recursionFunctionSolution = new RecursionFunctionSolution();
        recursionFunctionSolution.DFS(3);
    }
}
