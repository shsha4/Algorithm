package com.study.section7.section7_5;

/**
 * 이진트리 순회 (깊이우선탐색)
 * 전위순회 - 부모 - 왼쪽자식노드 - 오른쪽자식노드 (부모가 제일 먼저)
 * 중위순회 - 왼쪽자식노드 - 부모 - 오른쪽자식노드 (부모가 중간 순서)
 * 후위순회 - 왼쪽자식노드 - 오른쪽자식노드 - 부모 (부모가 제일 마지막)
 * */
class Node {
    int data;
    Node lt, rt;
    public Node(int data) {
        this.data = data;
        lt=rt=null;
    }
}
public class Main {
    Node root;
    public void DFS(Node root) {
        if (root == null) return;
        else {
            //System.out.print(root.data + " "); // 전위 순회
            DFS(root.lt);
            //System.out.print(root.data + " "); // 중위 순회
            DFS(root.rt);
            System.out.print(root.data + " "); // 후위 순회
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
        tree.DFS(tree.root);
    }
}
