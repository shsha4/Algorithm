package com.study.section7.section7_12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  경로 탐색(인접리스트)
 *  방향 그래프가 주어지면 1번 정점에서 N 번 정점으로 가는 모든 경로의 가지 수를 출력하는
 *  프로그램을 작성하세요.
 *   1 <-> 2 -> 5
 *   ↓ ↘ ↙ ↑  ↗
 *   3 ->  4
 *   11 섹션과 동일하지만 코드를 다르게 구현
 * */

//인접 행렬을 탐색할 때 N 이 크면 클수록 2중 for 문의 크기가 커지므로 비효율적
public class Main {
    static int n, m, answer= 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    public void DFS(int v) {
        if (n == v) answer++;
        else {
            for (int vn : graph.get(v)) {
                if (ch[vn] != 1) {
                    ch[vn] = 1;
                    DFS(vn);
                    ch[vn] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
