package com.study.section1_8;

import java.util.Scanner;

/**
 *  앞뒤가 같은 단어 심화 (알파벳만 비교 replaceAll 정규식 사용)
 * */
public class Main {
    public String solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) answer = "YES";
        return answer;
    }

    public static void main(String args[]) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
