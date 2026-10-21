package Tree.Traversal;
import java.util.LinkedList;
import java.util.Queue;
import Tree.Node;
// Idea is to visit all nodes at the same level before moving to the next level

// ⭐ Super-Simple Level Order Algorithm (BFS)
// 1. Put the root in a queue.
// 2. While queue not empty → remove node, print it, add its children.

public class LevelOrderTraversal { // Time: O(n), Space: O(n)
    public static void levelOrder(Node root){
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.remove();
            System.out.print(curr.data + " ");
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
    }
//       10              -> Queue: [10] -> Print: 10 -> Add → 20, 30 -> Queue: [20, 30] -> Print: 20 ->
//      /  \
//    20    30          -> Add → 40, 50 -> Queue: [30, 40, 50] -> Print: 30 -> Queue: [40, 50] -> Print: 40 ->
//   /  \
// 40    50             -> Queue: [50] -> Print: 50 -> Queue: [] -> Done!

    public static void main(String[] args) { 
        Node root = new Node(10);                                                  
        root.left = new Node(20);                   
        root.right = new Node(30);                  
        root.left.left = new Node(40);              
        root.left.right = new Node(50); 
        root.right.left = new Node(60);              
        root.right.right = new Node(70);              
        levelOrder(root);                               
    }                                                   
}                                                        
