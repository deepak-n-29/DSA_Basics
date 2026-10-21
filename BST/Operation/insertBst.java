package BST.Operation;

import BST.Node;
import BST.TraversalFromTree.InOrderTraversal;

public class insertBst {

//     1. Recursive Insert — Memory Algo
        // **“If null, create node.

        // If key smaller → go left.
        // If key bigger → go right.”**

        // That’s the whole recursion.
    public static Node recInsert(Node root, int key){ // Time Complexity O(h) and Space Complexity O(h)
        if(root==null)  return new Node(key);
        if(root.data>key) 
            root.left = recInsert(root.left, key);
        else 
            root.right = recInsert(root.right, key);
        return root; 
    }
//     2. Iterative Insert — Memory Algo
    // **“Walk down with curr, remember parent,
    // stop at null, attach new node to parent.”**
    // Or even shorter: “Search → Stop → Attach.”
    public static Node insert(Node root, int key){ // Time Complexity O(h) and Space Complexity O(1)
        Node temp = new Node(key);
        Node parent = null;
        Node curr = root;
        while(curr!=null){
            parent = curr;
            if(curr.data==key) return root;
            else if(curr.data<key) curr = curr.right;
            else curr = curr.left;
        }
        if(parent==null) return temp;
        if(parent.data>key) parent.left = temp;
        else parent.right = temp;

        return root;
    }

     public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.right = new Node(50);
       
        root = recInsert(root, 12);
        InOrderTraversal.inOrder(root);

    }
    
}
