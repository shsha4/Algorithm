package com.study.section2.section2_5;

import java.util.Scanner;

/**
 *  소수의 갯수 구하기
 *  에라토스테네스 체
 * */
public class Main {
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];
        for (int i = 2; i < n; i++) {
            if (ch[i]==0) {
                answer++;
                for (int j=i; j<=n; j=j+i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
