package com.study.section2_3;

import java.util.Scanner;

/**
 * 가위바위보 ( 1: 가위, 2: 바위, 3: 보)
 * */
public class Main {
    public String solution(int[] A, int[] B) {
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int set = kb.nextInt();
        int[] A = new int[set];
        int[] B = new int[set];
        for (int i = 0; i < A.length; i++) {
            A[i] = kb.nextInt();
        }

        for (int i = 0; i <  B.length; i++) {
            B[i] = kb.nextInt();
        }

        System.out.println(T.solution(A, B));
    }
}
