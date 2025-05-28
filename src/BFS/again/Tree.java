package BFS.again;

import java.util.LinkedList;
import java.util.Queue;

//너비우선탐색
public class Tree {

    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static void bfs(Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int l = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            System.out.print(l+" : ");
            for(int i=0;i<len;i++){
                Node node = Q.poll();
                System.out.print(node.data+" ");
                if(node.left != null) Q.offer(node.left);
                if(node.right != null) Q.offer(node.right);
            }
            l++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        bfs(root);
    }

}
