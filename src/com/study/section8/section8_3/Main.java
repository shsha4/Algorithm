package com.study.section8.section8_3;

import java.util.Scanner;

/*
* 최대점수 구하기(DFS)
* 이번 정보올림피아드대회에서 좋은 성적을 내기 위하여 현수는 선생님이 주신 N개의 문제를 풀려고 합니다.
* 각 문제는 그것을 풀었을 때 얻는 점수와 푸는데 걸리는 시간이 주어지게 됩니다.
* 제한시간 M안에 N개의 문제 중 최대점수를 얻을 수 있도록 해야 합니다.
* (해당문제는 해당시간이 걸리면 푸는 걸로 간주한다, 한 유형당 한개만 풀 수 있습니다.)
*
* */
public class Main {
    static int answer = Integer.MIN_VALUE;
    static int n;
    static int m;
    static int time = 0;

    public void DFS(int L, int sum, int time, int[] score, int[] leadTime) {
        if (time > m) return;
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L+1, sum + score[L], time + leadTime[L], score, leadTime);
            DFS(L+1, sum, time, score, leadTime);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        int[] score = new int[n];
        int[] leadTime = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = kb.nextInt();
            leadTime[i] = kb.nextInt();
        }
        T.DFS(0, 0, 0, score, leadTime);
        System.out.println(answer);
    }
}
