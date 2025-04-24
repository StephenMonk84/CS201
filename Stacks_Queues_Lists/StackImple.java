import java.util.NoSuchElementException;


public class StackImple implements Stack {
    // This is an implementation of a stack using a linked list
    // The stack is implemented using a singly linked list
    private class Node{
        int plate;
        Node next;
        public Node(int current){
            plate = current;
        }
    }
    private Node top;
        public StackImple(){
            top = null;
        }
        public void push(int value){
            Node c = new Node(value);
            c.next = top;
            top = c;
        }
        public int pop(){
            int returnPlate;
            returnPlate = top.plate;
            top= top.next;
            return returnPlate;
        }
        public boolean isEmpty(){
            return top == null;
        }
        public int size(){
            int counter = 0;
            for(Node node = top; node !=null; node = node.next){
                counter++;
            }
            return counter;
        }
        public int peek(){
            if(isEmpty()){
                throw new NoSuchElementException("Stack is empty");
            }
            return top.plate;
        }

}
