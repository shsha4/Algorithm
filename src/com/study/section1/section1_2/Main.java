package com.study.section1.section1_2;

import java.util.Scanner;

/**
 *  대소문자 변환
 * */
public class Main {
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            /* Character 객체 안 isLowerCase 로 소문자 확인 */
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
