public interface Stack {
    /** This is an interface that represents a stack of integers */
    public void push(int value); // Pushes an integer onto the stack
    public int pop(); // Removes and returns the top integer from the stack
    public int peek(); // Returns the top integer from the stack without removing it
    public boolean isEmpty(); // Checks if the stack is empty
    public int size(); // Returns the number of integers in the stack
}
