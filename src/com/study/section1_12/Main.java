package com.study.section1_12;

import java.util.Scanner;
/**
 *  암호 해석
 * */
public class Main {
    public String solution(int idx, String s) {
        String answer = "";
        for (int i = 0; i < idx; i++) {
            String tmp = s.substring(0 , 7).replace("#", "1").replace("*", "0");
            answer += (char) Integer.parseInt(tmp, 2);
            s = s.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int idx = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(idx, str));
    }
}
