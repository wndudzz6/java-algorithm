package DFS;

//8-5. 이진트리순회(DFS: Depth-First Search)
class Node{
    int data;
    Node lt, rt;
    Node(int val){
        data = val;
        lt = rt = null;
    }
}
public class P5T {
    Node root;

    static void DFS(Node root){
        if(root == null) return;
        else{
            //System.out.print(root.data+" "); //전위순회
            DFS(root.lt);
            System.out.print(root.data+" "); //현재 노드 출력
            DFS(root.rt);
            //System.out.print(root.data+" "); 후위순회
        }
    }

    public static void main(String[] args) {
        P5T tree = new P5T();
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
