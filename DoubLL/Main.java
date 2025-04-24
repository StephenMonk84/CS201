import java.util.*;

public class Main {
    public static void main(String[] args){
        DoubleLists dll = new DoubleLists(); // Create a new instance of the DoubleLists class
        dll.addToHead(50); // Add an element to the head of the list
        dll.addToTail(100); // Add an element to the tail of the list
        dll.addToHead(500); // Add another element to the head of the list
        dll.insertNode(dll.head.next, 75);
        dll.printList(dll.head); // Print the list starting from the head
    }
}
