package BST.Operation;

import BST.Node;

public class searchBst {
    
    public static boolean search(Node root, int key){
        while (root!=null) {
            if(root.data == key) return true;
            if(root.data > key) 
                root = root.left;
            else root = root.right;
        }
        return false;
    }
    public static boolean recursiveSearch(Node root, int key){ //Time Complexity O(n) and Space Complexity O(n)
        if(root==null) return false;
        if(root.data == key) return true;
        if(root.data > key) return recursiveSearch(root.left, key);
        return recursiveSearch(root.right, key);
    }


    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.right = new Node(50);

        System.out.println(search(root, 12));
        System.out.println();
        System.out.println(recursiveSearch(root, 13));
    }
}
