package Tree.problems;

import Tree.Node;

public class PrintNodesAtKdistance {

    public static void NodesAtkDistance(Node root, int k){
        if(root==null) return;
        if(k==0) System.out.print(root.data + " ");
        else{
            NodesAtkDistance(root.left, k-1);
            NodesAtkDistance(root.right, k-1);
        }
    }
    public static void main(String[] args) {
        
        int k = 2;
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        NodesAtkDistance(root, k);
    }
    
}
