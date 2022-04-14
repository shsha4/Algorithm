package com.study.section4.section4_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 학급 회장
 * 학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
 * 투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
 * 선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
 * 반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.
 * */
public class Main {

    public char solution(int n, String vote) {
        char answer = ' ';
        Map<Character, Integer> list = new HashMap<>();
        for (char x : vote.toCharArray()) {
            list.put(x, list.getOrDefault(x, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (Character k : list.keySet()) {
            if (list.get(k) > max) {
                max = list.get(k);
                answer = k;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String vote = kb.next();
        System.out.println(T.solution(n, vote));
    }
}
