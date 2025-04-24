import java.util.*;
import java.util.Arrays;
public class DoubleLists {
    Node head; // Pointer to the head of the list

    public void addToHead(int element){
        Node n = new Node(element); // Create a new node with the given element
        n.next = head; // Set the next pointer of the new node to the current head  
        n.prev = null; // Set the previous pointer of the new node to null
        if (head != null) { // If the list is not empty
            head.prev = n; // Set the previous pointer of the current head to the new node
        }
        head = n; // Update the head pointer to the new node
    }

    public void addToTail(int element){
        Node n = new Node(element); // Create a new node with the given element
        Node end = head; // Start from the head of the list
        n.next = null; // Set the next pointer of the new node to null
        if(head == null) { // If the list is empty
            n.prev = null; // Set the previous pointer of the new node to null
            head = n; // Update the head pointer to the new node
            return;
        }
        while(end.next != null) { // Traverse to the end of the list
            end = end.next; // Move to the next node
        }
        end.next = n; // Set the next pointer of the last node to the new node
        n.prev = end; // Set the previous pointer of the new node to the last node
    }

    public void insertNode(Node prev, int element){
        if(prev == null) { // If the previous node is null
            System.out.println("The given previous node cannot be null"); // Print an error message
            return; // Exit the method
        }
        Node n = new Node(element); // Create a new node with the given element
        n.next = prev.next; // Set the next pointer of the new node to the next node of the previous node
        prev.next = n; // Set the next pointer of the previous node to the new node
        n.prev = prev; // Set the previous pointer of the new node to the previous node
        if(n.next != null) { // If the next node is not null
            n.next.prev = n; // Set the previous pointer of the next node to the new node
        }
    }

    public void printList(Node node){
        System.out.println("Traversal in forward direction"); // Print a message
        Node end = null; // Initialize a variable to keep track of the end of the list
        while(node != null) { // Traverse the list
            System.out.print(node.element + " "); // Print the element of the current node
            end = node; // Update the end variable to the current node
            node = node.next; // Move to the next node
        }
        System.out.println(); // Print a new line
        System.out.println("Traversal in reverse direction"); // Print a message
        while(end != null) { // Traverse the list in reverse order
            System.out.print(end.element + " "); // Print the element of the current node
            end = end.prev; // Move to the previous node
        }
    }
}
