package Tree.problems;

import Tree.Node;

public class HeightOfBinaryTree { // Time Complexity: O(n) And Space Complexity: O(H)

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

//         10
//        /  \
//      20    30
//     /  \
//   40    50
    public static void main(String[] args) {
        
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        System.out.println(height(root));
    }
}

// height(10)
//  ├── height(20)
//  │     ├── height(40)
//  │     │      ├── height(null) → 0
//  │     │      └── height(null) → 0
//  │     │
//  │     │  return 1 + max(0,0) = 1
//  │     │
//  │     └── height(50)
//  │            ├── height(null) → 0
//  │            └── height(null) → 0
//  │
//  │        return 1 + max(0,0) = 1
//  │
//  │  return 1 + max(1,1) = 2
//  │
//  └── height(30)
//         ├── height(null) → 0
//         └── height(null) → 0

//      return 1 + max(0,0) = 1

// Final return for height(10):
// 1 + max(2,1) = **3**

// ********************************************************************************************//
// 🧠 DETAILED EXPLANATION
// ✔ 1. Not parallel

// Java does not run these two recursive calls at the same time.
// There are no threads here.

// height(root.left) must complete first, returning a height.
// Only then Java calls height(root.right).

// ✔ 2. Same recursion stack

// All recursive calls use the same call stack, because:

// Recursion uses stack frames

// Each function call adds a new frame on top

// When a call returns, its frame is removed

// Both left and right subtree calls share the same single stack, happening one after another.