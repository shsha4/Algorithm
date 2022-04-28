package com.study.section7.section7_2;

import java.util.Scanner;

/**
 * 재귀함수를 이용한 2진수 출력
 * 10진수 N 이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요.
 * */
public class Main {

    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        T.DFS(n);
    }
}
