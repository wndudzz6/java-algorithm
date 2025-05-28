package BFS;

import java.util.LinkedList;
import java.util.Queue;

//Tree 말단 노드까지의 가짧경
public class P9T {
    static class Node {
        int data;
        Node lt;
        Node rt;
        public Node(int data) {
            this.data = data;
            this.lt = null;
            this.rt = null;
        }
    }

    static int bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int l = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for(int i = 0; i < len; i++) {
                Node cur = q.poll();
                if(cur.lt == null && cur.rt == null) return l;

                if(cur.lt != null) q.offer(cur.lt);
                if(cur.rt != null) q.offer(cur.rt);
            }
            l++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(bfs(root));
    }
}
