package com.study.section3.section3_1;

import java.util.*;

/**
 *  두 배열 합치기
 * */
public class Main {

    /* 투 포인터를 지정하여 배열정렬 */
    private ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < n && p2 < m){
            if (a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while(p1 < n) answer.add(a[p1++]);
        while(p2 < m) answer.add(b[p2++]);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = kb.nextInt();
        }
        for(int x : T.solution(n, m, arr1, arr2)) {
            System.out.print(x + " ");
        }
    }
}
