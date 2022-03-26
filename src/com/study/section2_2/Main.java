package com.study.section2_2;

import java.util.Scanner;

/**
 *  설명
 * 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
 * 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 * */
public class Main {
    public int solution(int[] arr) {
        int answer = 1;
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            max = Math.max(max, arr[i]);
            if (max < arr[i+1]) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < arr.length -1; i++) {
            arr[i] = kb.nextInt();
        }
        arr[n] = 0;
        System.out.println(T.solution(arr));
    }
}
