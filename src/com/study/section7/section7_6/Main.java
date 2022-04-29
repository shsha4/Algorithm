package com.study.section7.section7_6;

import java.util.Scanner;

/**
 *  부분집합 구하기(DFS)
 *  자연수 N 이 주어지면 1부터 N 까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요.
 *  공집합은 출력하지 않는다.
 * */
public class Main {
    static int n;
    static int[] ch;
    public void DFS(int L) {
        if (L == n+1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    tmp += (i + " ");
                }
            }
            if (tmp.length() > 0) System.out.println(tmp);
        }
        else {
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new int[n + 1];
        T.DFS(1);
    }
}
