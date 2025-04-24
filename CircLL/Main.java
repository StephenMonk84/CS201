import java.util.*;

public class Main {
    public static void main(String[] args){
        CircularLinkedList cll = new CircularLinkedList(); // Create a new CircularLinkedList object
        cll.addNodeToHead(75); // Add a node with value 75 to the head of the list
        cll.addNodeToHead(50); // Add a node with value 50 to the head of the list
        cll.addNodeToHead(25); // Add a node with value 25 to the head of the list
        cll.print(); // Print the elements of the circular linked list
        cll.addNodeToTail(100); // Add a node with value 100 to the tail of the list
        cll.print(); // Print the elements of the circular linked list
        cll.rotateElement(); // Rotate the list by one position
        cll.print(); // Print the elements of the circular linked list after rotation
        cll.deleteNodeFromTail(); // Delete the tail node from the list
        cll.print(); // Print the elements of the circular linked list after deletion
        cll.deleteNodeFromHead(); // Delete the head node from the list
        cll.print(); // Print the elements of the circular linked list after deletion
    }
}
