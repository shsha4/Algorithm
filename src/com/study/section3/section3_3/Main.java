package com.study.section3.section3_3;

import java.util.Scanner;

/*
*   최대 매출 구하기
*   현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
*   만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
*   12 1511 20 2510 20 19 13 15
*   연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
* */
public class Main {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;
        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i-k]);
            if (sum > answer) {
                answer = sum;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}
