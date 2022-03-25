package com.study.section1_9;

import java.util.Scanner;

/**
 *  숫자만 추출
 * */
public class Main {
    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s.replaceAll("[^0-9]", ""));
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
