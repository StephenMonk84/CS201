import java.util.*;

public class CircularLinkedList {
    public int size = 0; // Size of the list
    public Node head = null;
    public Node tail = null; // Tail of the list

    public void print(){
        System.out.print("Circular Linked List: ");
        Node current = head; // Start from the head
        do{
            System.out.print(" " + current.element); // Print the current node's element
            current = current.next; // Move to the next node
        } while (current != head); // Continue until we loop back to the head
        System.out.println(); // Print a new line at the end
    }

    public void addNodeToHead(int element) {
        Node newNode = new Node(element); // Create a new node with the given element
       if (size ==0){
        head = newNode; // If the list is empty, set head to the new node
        tail = newNode; // Set tail to the new node as well
        newNode.next = head; // Point the new node to itself (circular link)
       }
       else{
        Node current = head; // Start from the head
        newNode.next = current; // Point the new node to the current head
        head = newNode; // Update head to the new node
        tail.next = head; // Update the tail's next pointer to point to the new head
       }
       size++; // Increment the size of the list
}

public void addNodeToTail(int element){
    if (size==0){
        addNodeToHead(element);
    }
    else{
        Node newNode = new Node(element); // Create a new node with the given element
        tail.next = newNode; // Point the current tail's next to the new node
        tail = newNode; // Update the tail to the new node
        tail.next = head; // Point the new tail's next to the head (circular link)
        size++; // Increment the size of the list
    }
}
public void rotateElement(){
    System.out.println("Rotating the list by one position...");
    tail = head; // Move the tail to the head
    head = head.next; // Move the head to the next node
}
public void deleteNodeFromTail(){
    System.out.println("\nDeleting the tail node...");
    if(tail.next==tail){
        tail=null; // If the list is empty, set tail to null
    }
    Node newTail = tail; // Start from the tail
    while(newTail.next != tail){ // Traverse the list to find the new tail
        newTail = newTail.next; // Move to the next node
    }
    newTail.next = tail.next; // Point the new tail's next to the head
    tail = newTail; // Update the tail to the new tail
}
public void deleteNodeFromHead(){
    head =head.next; // Move the head to the next node
    tail.next = head; // Update the tail's next pointer to point to the new head
    size--; // Decrement the size of the list
}
}
