package BST.TraversalFromTree;

import BST.Node;

public class InOrderTraversal { // TIME COMPLEXITY: O(N) // AUX SPACE O(H)

    public static void inOrder(Node root){ // LEFT ROOT RIGHT
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    
    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.right = new Node(50);
        inOrder(root);
    }

}

// Recursion tree for inorder traversal : 40, 20, 50, 10, 30

// in(10)
// ├── in(20)
// │     ├── in(40)
// │     │      ├── in(null)
// │     │      └── in(null)
// │     │      print(40)
// │     └── in(50)
// │            ├── in(null)
// │            └── in(null)
// │            print(50)
// │     print(20)
// └── in(30)
//        ├── in(null)
//        └── in(null)
//        print(30)
// print(10)