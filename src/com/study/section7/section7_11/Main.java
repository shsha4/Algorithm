package com.study.section7.section7_11;

import java.util.Scanner;

/**
 *  방향그래프가 주어지면 1번 정점에서 N 번 정점으로 가는 모든 경로의 가지 수를 출력하는
 *  프로그램을 작성하세요.
 *   1 <-> 2 -> 5
 *   ↓ ↘ ↙ ↑  ↗
 *   3 ->  4
 * */
public class Main {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == n) {
            //정점 도착시 카운트
            answer++;
        } else {
            // n 번까지의 모든 경우의 수를 확인 반복문
            for (int i = 1; i <= n; i++) {
                // 현재 node 의 간선이 갈 수 있고 (1값), 미방문 (0값) 이라면
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1; // 간선이 방문됐다고 1 값 설정
                    DFS(i); // 재귀적 호출로 다음 node 호출
                    ch[i] = 0; // 스택에서 빠져나와 다시 라인으로 복귀 시 0으로 미방문으로 초기화
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt(); // 정점 목적지
        m = kb.nextInt(); // 간선의 수
        graph = new int[n+1][m+1]; // 1번 인덱스부터 사용
        ch = new int[n+1]; // 방문했는지 체크 배열 1: 방문, 0 : 미방문
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            //입력된 간선 그래프 배열에 표시
            graph[a][b] = 1;
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
