package com.study.section2_1;

import java.util.Scanner;

/**
 *
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 * (첫 번째 수는 무조건 출력한다)
 * */
public class Main {
    public String solution(int[] input) {
        int tmp = input[0];
        String answer = "";
        for (int x : input) {
            if (tmp <= x) {
                answer += String.valueOf(x) + " ";
            }
            tmp = x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int idx = kb.nextInt();
        int[] intArr = new int[idx];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = kb.nextInt();
        }
        System.out.println(T.solution(intArr));
    }
}
