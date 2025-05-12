package DFS;

//이진트리 DFS 방식으로 순회 내 방식으로 다시
public class BinaryAgain {
    static class Node{
        int data;
        Node lt, rt;
        Node(int val){
            data = val;
            lt = rt = null;
        }
    }
    static void DFS(Node root){
        if(root == null) return;
        else{
            DFS(root.lt);
            System.out.print(root.data+" ");
            DFS(root.rt);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.rt = new Node(2);
        root.lt = new Node(3);
        root.lt.rt = new Node(4);
        root.lt.lt = new Node(5);

        DFS(root);
    }
}
