package BST.Operation;

import BST.Node;

public class floorInBst {

    public static Node floor(Node root, int key){ // Time Complexity O(h) and Space Complexity O(1)
        if(root == null) return null;
        Node res = null;
        while(root!=null){
            if(root.data == key) 
                return root;
            if(root.data > key) 
                root = root.left;
            else{
                res = root; 
                root = root.right;
            }
                
        }
        return res;
    }

    public static Node floorRec(Node root, int key){ // Time Complexity O(h) and Space Complexity O(h)

        if(root == null) return null;
        if(root.data == key) return root;
        if(root.data > key) return floorRec(root.left, key);

        Node res = floorRec(root.right, key);
        return res == null ? root : res;

    }
    
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.right = new Node(50);

        Node res = floor(root, 12);
        System.out.println(res.data);

        res = floorRec(root, 12);
        System.out.println(res.data);
    }
}
