package BST.Operation;

import BST.Node;
import BST.TraversalFromTree.InOrderTraversal;

// 👉 “A node is deleted when recursion returns null or a child, and the parent updates its link.”
public class deleteBst {

    // Successor = leftmost node of right subtree → smallest element greater than current.
    // 👉 “Successor = Right once, Left many times.”
    public static Node getSuccessor(Node root){
        Node curr = root;
        while(curr!=null && curr.left!=null){
            curr = curr.left;
        }
        return curr;
    }
    // Case 1: Leaf Node
    // Case 2: One Child
    // Case 3: Two Children
    public static Node delete(Node root, int key) {
        if(root==null) return null;
        if(root.data>key) root.left = delete(root.left, key);
        else if(root.data<key) root.right = delete(root.right, key);
        else{
            if(root.left==null) return root.right;           // Case 1 or Case 2
            else if(root.right==null) return root.left;      // Case 2
            Node successor = getSuccessor(root);             // Case 3
            root.data = successor.data;
            root.right = delete(root.right, root.data);     // After copying the successor’s value into the node, the successor is deleted when this line runs
        }
        return root;
    }
    public static void main(String[] args) {
        
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.right = new Node(50);

        root = delete(root, 2);
        InOrderTraversal.inOrder(root);
    }
}

// 🔥 BST Delete Memory Algo (learn this!)

// 1. Search normally
// Left if key smaller
// Right if key bigger
// 👉 “Search until found.”

// 2. If leaf → delete it
// 👉 “Leaf? Remove.”

// 3. If one child → replace with child
// 👉 “One child? Promote child.”

// 4. If two children → successor trick
// 👉 “Two kids? Copy successor → delete successor.”
