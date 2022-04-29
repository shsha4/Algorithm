package com.study.section7.section7_7;

import java.util.LinkedList;
import java.util.Queue;

/**
 * BFS (넓이 우선 탐색 : 레벨탐색)
 * 부모 - 자식 - 손자 순으로 순회
 * 주로 최단거리 알고리즘에 사용됨(root(부모) 노드에서 몇 번째로 갈지 탐색)
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
    Node root;

    public void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) {
                    Q.offer(cur.lt);
                }
                if (cur.rt != null) {
                    Q.offer(cur.rt);
                }
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}
