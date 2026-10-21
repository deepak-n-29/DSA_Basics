package Hashing.OpenAddressing;
import java.util.*;
// Implementation of Open Addressing in Hashing using linear probing
// Idea is to store all keys directly in the hash table array
// When a collision occurs (i.e., the hashed index is already occupied), we probe linearly to find the next available slot
// This way, all keys are stored within the hash table itself without using additional data structures
// Insertion, searching, and deletion operations will involve probing through the array to find the correct slot
// This approach allows for efficient use of space since all keys are stored in the array itself
// Time Complexity: O(1) on average for insert, search, and delete operations, but can degrade to O(n) in worst case if the table is full or nearly full
// Space Complexity: O(n) for storing the keys in the hash table
// where n is the number of keys inserted into the hash table
// Overall, open addressing is a widely used method for collision resolution in hash tables
// and is particularly effective when the load factor of the hash table is kept low.   
// Linear probing is one of the simplest forms of open addressing, but other probing techniques like quadratic probing and double hashing can also be used for better performance in some cases.
// Here, we implement linear probing for simplicity.
// We use -1 to indicate empty slots and -2 to indicate deleted slots in the hash table.// This helps in handling deletions without breaking the probing sequence.
// Note: In a production scenario, we would need to handle resizing of the hash table when it becomes too full to maintain performance.

class MyHash{
    int array[];
    int capacity;
    int size;

    MyHash(int c){
        capacity = c;
        size = 0;
        array = new int[capacity];
        Arrays.fill(array, -1); // -1 indicates empty slot
    }

    int hash(int key){
        return key % capacity;
    }

    boolean insert(int key){
        if(size ==capacity) return false; // Hash table is full
        int i = hash(key);

        while(array[i] != -1 && array[i] != -2 && array[i]!=key){ // -2 indicates deleted slot
            i = (i + 1) % capacity; // Linear probing
        }
        array[i]=key;
        size++;
        return true;
    }

    boolean search(int key){
        int h = hash(key); // Get the hash index
        int i = h;

        while(array[i] != -1){ // Stop if we find an empty slot
            if(array[i]==key){
                return true; // Key found
            }
            i = (i + 1) % capacity; // Linear probing
            if(i==h) break; // We have looped through the table
        }
        return false; // Key not found
    }

    boolean delete(int key){
        int h = hash(key);
        int i = h;

        while(array[i] != -1){
            if(array[i]==key){
                array[i]=-2; // Mark as deleted
                size--;
                return true;
            }
            i = (i + 1) % capacity;
            if(i==h) break;
        }
        return false; // Key not found
    }

}

public class ImplementationOfOpenAddressing {
    
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
