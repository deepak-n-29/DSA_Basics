package Tree.problems;

import Tree.Node;

public class MaximumInBinaryTree {
    
    public static int getMax(Node root){ // ROOT LEFT RIGHT // O(n)
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(getMax(root.left), getMax(root.right)));
    }
    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        System.out.println(getMax(root));
    }
}

// ⭐ Maximum in Binary Tree — Memory Algorithm (DFS)
// 1️⃣ Return the max of three things:
        // the root’s value,
        // the max of the left subtree,
        // the max of the right subtree.

// 2️⃣ For null nodes → return −∞ (Integer.MIN_VALUE).
