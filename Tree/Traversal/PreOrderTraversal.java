package Tree.Traversal;

import Tree.Node;
public class PreOrderTraversal { // TIME COMPLEXITY O(N) // AUX SPACE O(H)
    
    public static void preOrder(Node root){ // ROOT LEFT RIGHT
        if(root==null) return;

        System.out.print(root.data + " "); 
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        preOrder(root);
    }
}
// RECURSION TREE FOR 10, 20, 40, 50, 30

// pre(10)
// │  print(10)
// ├── pre(20)
// │      print(20)
// │     ├── pre(40)
// │     │      print(40)
// │     │      ├── pre(null)
// │     │      └── pre(null)
// │     └── pre(50)
// │            print(50)
// │            ├── pre(null)
// │            └── pre(null)
// └── pre(30)
//        print(30)
//        ├── pre(null)
//        └── pre(null)


