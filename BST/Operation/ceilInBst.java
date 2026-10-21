package BST.Operation;

import BST.Node;

public class ceilInBst {

// If node < key → go right
// If node > key → save it, go left

// “When going left, save the node — it may be the ceil.”
    public static Node ceil(Node root, int key){ // Time Complexity O(h) and Space Complexity O(1)
        if(root == null) return null;
        Node res = null;
        while(root!=null){
            if(root.data == key) 
                return root;
            if(root.data < key) 
                root = root.right;
            else{
                res = root; 
                root = root.left;
            }
                
        }
        return res;
    }

    public static Node ceilRec(Node root, int key){ // Time Complexity O(h) and Space Complexity O(h)
        if(root == null) return null;
        if(root.data == key) return root;
        if(root.data < key) return ceilRec(root.right, key);

        Node res = ceilRec(root.left, key);
        return res == null ? root : res;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.right = new Node(50);


        Node res = ceil(root, 12);
        System.out.println(res.data);
    }    
}
