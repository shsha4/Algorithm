package com.study.section4.section4_4;

import java.util.HashMap;
import java.util.Scanner;

/**
 * S 문자열에서 T 문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
 * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
 * */
public class Main {
    public int solution(String s, String t) {
        int answer = 0;
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        for (Character x : t.toCharArray()) {
            tmap.put(x, tmap.getOrDefault(x, 0) + 1);
        }
        for (int i = 0; i < t.length() -1; i++) {
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
        }
        int lt = 0;
        for (int rt = t.length() -1; rt < s.length(); rt++) {
            smap.put(s.charAt(rt), smap.getOrDefault(s.charAt(rt), 0) + 1);
            if (tmap.equals(smap)) {
                answer++;
            }
            smap.put(s.charAt(lt), smap.get(s.charAt(lt)) - 1);
            if (smap.get(s.charAt(lt)) == 0) smap.remove(s.charAt(lt));
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        String t = kb.next();
        System.out.println(T.solution(s, t));
    }
}
