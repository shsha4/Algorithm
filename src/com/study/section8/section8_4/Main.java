package com.study.section8.section8_4;

import java.util.Scanner;

/*
* 중복순열 구하기
* 1부터 N 까지 번호가 적힌 구슬이 있습니다. 이 중 중복을 허락하여
* M 번을 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
* */
public class Main {
    static int n;
    static int m;
    static int[] pm;

    public void DFS(int L) {
        if (L == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];
        T.DFS(0);
    }
}
