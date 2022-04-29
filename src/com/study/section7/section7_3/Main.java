package com.study.section7.section7_3;

import java.util.Scanner;

/**
 *  팩토리얼 자연수 N! 을 출력하는 프로그램을 작성하시오 (재귀함수 사용)
 * */
public class Main {

    public int factorial(int n) {
        if (n == 1) return 1;
        else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.factorial(n));
    }
}
