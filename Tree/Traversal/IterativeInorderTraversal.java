package Tree.Traversal;

import java.util.Stack;

import Tree.Node;

public class IterativeInorderTraversal { // Time: O(n), Space: O(h)

    public static void Inorder(Node root){
        if(root==null) return;
        Node curr = root;
        Stack<Node> st = new Stack<>();
        while(curr!=null || !st.isEmpty()){
            while (curr!=null) {
                st.push(curr);
                curr = curr.left;
            }
            curr=st.pop();
            System.out.print(curr.data+" ");
            curr=curr.right;
        }

    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        Inorder(root);
    }
}

// ⭐ ITERATIVE INORDER — MEMORY ALGORITHM
// 1️⃣ Keep pushing LEFT nodes into the STACK.
// 2️⃣ When you can't go left:
        // POP from stack
        // PRINT the node
        // MOVE to its RIGHT child

// Repeat until both stack is empty and curr is null.