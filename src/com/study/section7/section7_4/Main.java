package com.study.section7.section7_4;

import java.util.Scanner;

/**
 * 피보나치 수열 (재귀함수)
 * 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 더하여 다음 숫자가 되는 수열이다.
 * 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 * */
public class Main {

    static int[] fibo;

    public int DFS(int n) {
        if (n==1) return fibo[n] = 1;
        if (n==2) return fibo[n] = 1;
        if (fibo[n] > 0) {
            return fibo[n];
        } else {
            return fibo[n] = DFS(n-2) + DFS(n-1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        /*
          재귀함수는 스택 메모리 구조를 사용하므로 연산에 오래걸림
         그래서 스태틱 변수를 지정하여 이미 호출된 값을 저장하는 변수를 사용한다
          그래도 느리기때문에 메로리 제이션을 이용한다
          그래도 for 문 돌리는게 더 빠름 Stack 의 메모리 프레임 계속 생성하기 때문에 느림
         */
        fibo = new int[n+1];

        for (int i = 1; i <= n; i++) System.out.print(T.DFS(i) + " ");
    }
}
