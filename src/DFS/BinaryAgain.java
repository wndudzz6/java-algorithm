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

            DFS(root.rt);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        DFS(root);
    }
}
