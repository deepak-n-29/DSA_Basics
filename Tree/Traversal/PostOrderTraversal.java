package Tree.Traversal;
import Tree.Node;

public class PostOrderTraversal{ // TIME COMPLEXITY O(N) // AUX SPACE O(H)
    
    public static void postOrder(Node root){ // LEFT RIGHT ROOT
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        postOrder(root);
    }
}

// RECURSION TREE for POSTORDER TRAVERSAL : 40, 50, 20, 30, 10

// post(10)
// ├── post(20)
// │     ├── post(40)
// │     │      ├── post(null)
// │     │      └── post(null)
// │     │      print(40)
// │     └── post(50)
// │            ├── post(null)
// │            └── post(null)
// │            print(50)
// │     print(20)
// └── post(30)
//        ├── post(null)
//        └── post(null)
//        print(30)
// print(10)