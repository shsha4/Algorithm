package com.study.section1_1;

import java.util.Scanner;

/**
 *  문자 찾기
 * */

public class Main {

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for (char x : str.toCharArray())
            if (x == t) answer++;
        return answer;
    }
    /**
     *  입력받은 문자열에 원하는 문자 하나가 몇개 포함되어있는지 확인
     *  입력받은 문자열과 원하는 문자를 대소문자 관계 없이 보기 위해 -> toUpperCase 활용
     * */

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        Main T = new Main();
        System.out.println(T.solution(str, c));
    }
}
