package Tree.Traversal;

import java.util.Stack;

import Tree.Node;

public class IterativePreorderTraversal {

    // ⭐ PREORDER = ROOT → LEFT → RIGHT // Iterative version uses a stack.
    // ✅ EASY MEMORY ALGORITHM -> PUSH ROOT “Pop → Print → Push Right → Push Left”

// Start:
// Stack = [10]

// 1) Pop 10 → print it.             // 2) POP 20 → print it                     // 3) POP 40 -> print it                  // 4) POP 50 -> print it                     // 5) POP 30 -> print it
// Push right (30), push left (20)   // Push right (50), push left (40)          //  Push right (null), push left (null)   // Push right (null), push left (null)       // Push right (null), push left (null)
// Stack = [30, 20]  Output=[10]     // Stack = [30, 50, 40]  Output=[10, 20]    //  Stack = [null]  Output=[10, 20, 40].  // Stack = [null]  Output=[10, 20, 40, 50]   // Stack = [null]  Output=[10, 20, 40, 50, 30]
    public static void preorder(Node root){ // Time: O(n), Space: O(n)
        if(root==null) return;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node curr = st.pop();
            System.out.print(curr.data + " ");
            if(curr.right!=null) st.push(curr.right);
            if(curr.left!=null) st.push(curr.left);
        }
    }

//⭐ Expanded (still very simple):
    // 1. Print every node immediately
        // (because preorder = Root → Left → Right)
    // 2. Go left as far as possible
    // 3. Whenever you see a right child, push it
        // (to handle it later after the entire left chain finishes)
    // 4. If you can't go left anymore, pop a right child and continue
    public static void preOrderSpaceOptimized(Node root){ // Time: O(n), Space: O(h) where h is the height of the tree.
        if(root==null) return;
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while(curr!=null||!st.isEmpty()){
            while (curr!=null) {
                System.out.print(curr.data+" -> ");
                if(curr.right!=null) 
                    st.push(curr.right);
                curr=curr.left;
            }
            if(!st.isEmpty()){
                curr = st.pop();
            }
        }
    }
    // Memory flow:
//        10            // Print 10 → push 30 → go left
//       /  \           // Print 20 → push 50 → go left
//     20    30         // Print 40 → left ends → pop → 50
//    / \               // Print 50 → left ends → pop → 30
//   40  50             // Print 30 → done
    
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        preorder(root);
        System.out.println();
        preOrderSpaceOptimized(root);
    }
    
}
