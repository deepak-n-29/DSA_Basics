package Hashing.Chaining;
import java.util.*;

// Implementation of Chaining in Hashing using array of linked lists
// Idea is to maintain a linked list for each index in the hash table to handle collisions
// Each linked list will store all keys that hash to the same index
// This way, multiple keys can be stored at the same index without overwriting each other
// Insertion, searching, and deletion operations will involve traversing the linked list at the hashed index
// This approach allows for efficient handling of collisions and maintains the integrity of the hash table
// even when multiple keys hash to the same index.
// Time Complexity: O(1) on average for insert, search, and delete operations, but can degrade to O(n) in worst case if many keys collide
// Space Complexity: O(n) for storing the keys in the linked lists
// where n is the number of keys inserted into the hash table
// Overall, chaining is a simple and effective method for collision resolution in hash tables
// and is widely used in practice due to its simplicity and efficiency.
// we can use dynamic array or self balancing BST instead of linked list for better performance in some cases but linked list is most commonly used due to its simplicity.
class MyHash{
    private int BUCKET;
    private ArrayList<LinkedList<Integer>> table;

    MyHash(int b){
        this.BUCKET = b;
        table = new ArrayList<>(BUCKET);
        for(int i=0; i<BUCKET; i++){
            table.add(new LinkedList<>());
        }
    }

    void insert(int key){
        int index = key % BUCKET;
        table.get(index).add(key);
    }

    boolean search(int key){
        int index = key % BUCKET;
        return table.get(index).contains(key);
    }

    void delete(int key){
        int index = key % BUCKET;
        table.get(index).remove((Integer)key);
    }
}

public class ImplementationOfChaining {

    public static void main(String[] args) {
        MyHash hash = new MyHash(7);

        hash.insert(10);
        hash.insert(20);
        hash.insert(15);
        hash.insert(7);
        hash.insert(32);

        System.out.println("Searching 15: " + hash.search(15)); // true
        System.out.println("Searching 99: " + hash.search(99)); // false

        hash.delete(15);
        System.out.println("Searching 15 after deletion: " + hash.search(15)); // false
    }
}
