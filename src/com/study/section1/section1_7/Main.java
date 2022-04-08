package com.study.section1.section1_7;

import java.util.Scanner;

/**
 *  회문 문자열(단어가 앞이나 뒤로 시작했을때 같다면 yes ex.goog)
 * */
public class Main {
    public String solution(String str) {
//        StringBuilder 사용 방식
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString(); // reverse를 사용하여 문자열을 뒤집는다
        // equalsIgnoreCase 를 사용하여 대소문자를 가리지 않고 비교
        if (str.equalsIgnoreCase(tmp)) {
            answer = "YES";
        }

//        for 문 돌리는 방식
//        str = str.toUpperCase();
//        String answer = "YES";
//        int len = str.length();
//        for (int i = 0; i < len / 2; i++) {
//            if (str.charAt(i) != str.charAt(len - i - 1)) {
//                return "NO";
//            }
//        }
        return answer;
    }

    public static void main(String args[]) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
