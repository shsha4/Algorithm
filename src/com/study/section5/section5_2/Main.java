package com.study.section5.section5_2;

import java.util.Scanner;
import java.util.Stack;

/**
 * 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
 * */
public class Main {

    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (Character x : str.toCharArray()) {
            if (x.equals(')')) {
                while (!stack.pop().equals('('));
            } else {
                stack.push(x);
            }
        }
        for (Character x : stack) {
            answer += x;
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
