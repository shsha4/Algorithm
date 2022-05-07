package com.study.section8.section8_2;

import java.util.Scanner;

/*
* 바둑이 승차(DFS)
* 철수는 그의 바둑이들을 데리고 시장에 가려고 한다. 그런데 그의 트럭은 C 킬로그램 넘게 태울수가 없다.
* 철수는 C를 넘지 않으면서 그의 바둑이들을 가장 무겁게 태우고 싶다.
* N 마리의 바둑이와 각 바둑이의 무게 W가 주어지면, 철수가 트럭에 태울 수 있는 가장 무거운 무게를 구하는 프로그램을 작성하세요.
* */
public class Main {
    static int answer = Integer.MIN_VALUE;
    static int c;
    static int n;
    public void DFS(int L, int sum, int[] arr) {
        if (sum > c) return;
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
