package com.study.section7.section7_1;

import java.util.Scanner;

/**
 * 재귀함수
 * 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N 까지를 출력하는 프로그램을 작성하세요.
 * */
public class Main {

    public void DFS(int n) {
        // if n = 3
        if (n > 0) {
            System.out.print(n + " "); // output : 3 2 1
            System.out.println();
            DFS(n - 1);
            /* 재귀함수는 Stack 을 사용한다 Stack 쌓인 순서 (DFS(0) / DFS(1) / DFS(2) / DFS(3) ) */
            System.out.print(n + " "); // output : 1 2 3
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        T.DFS(n);
    }
}
