package com.study.section7.section7_9;

/**
 * DFS
 * 루트 노드에서 부터 말단 노드까지의 가장 잛은 거리 구하기
 * */
class Node {
    int data;
    Node lt;
    Node rt;
    public Node(int data) {
        this.data = data;
        this.lt = null;
        this.rt = null;
    }
}
public class Main {
    public int DFS(int L, Node root) {
        if (root.lt == null && root.rt == null) return L;
        else {
            return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(T.DFS(0, root));
    }
}
