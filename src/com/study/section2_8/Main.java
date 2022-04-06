package com.study.section2_8;

import java.util.Scanner;

/**
 *  등수 구하기
 *  N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 * */
public class Main {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        /* 2중 for 문을 돌리며 기준 점수보다 크다면 등수를 1씩 증가시킨다 */
        /* 같은 점수일 땐 당연히 같은 등수로 나오게 됨 */
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
