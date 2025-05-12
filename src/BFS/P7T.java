package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class P7T {

    static class Node{
        int data;
        Node lt, rt;
        public Node(int val) {
            this.data = val;
            lt = rt = null;
        }
    }

    public static class Main{
        Node root;
        public void BFS(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            int L = 0; //level
            while(!q.isEmpty()){ //현재 레벨의 노드 개수
                int len = q.size(); //현재 레벨 출력
                System.out.print(L+" : ");
                for(int i = 0; i < len; i++){
                    Node cur = q.poll(); //현재 노드 꺼냄
                    System.out.print(cur.data+" ");
                    if(cur.lt != null) q.add(cur.lt); //왼쪽 자식 추가
                    if(cur.rt != null) q.add(cur.rt); //오른쪽 자식 추가.
                }
                L++;
                System.out.println();
            }
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
