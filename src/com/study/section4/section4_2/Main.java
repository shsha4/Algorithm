package com.study.section4.section4_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 아나그램
 * Anagram 이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
 * 예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
 * 알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
 * 길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.
 * */
public class Main {
    public String solution(String a, String b) {
        String answer = "YES";
        Map<Character, Integer> map = new HashMap<>();
        for (Character key : a.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (Character key : b.toCharArray()) {
            if (!map.containsKey(key) || map.get(key) == 0) return "NO";
            map.put(key, map.get(key) - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(T.solution(a, b));
    }
}
