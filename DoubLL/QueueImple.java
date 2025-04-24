import java.util.*;

public class QueueImple {
    public static void main(String[] args){
        Queue<String> coffeeShop = new LinkedList<String>();
        coffeeShop.add("John");
        coffeeShop.add("Mary");
        coffeeShop.add("Tom");
        coffeeShop.add("Stephen");
        System.out.println(coffeeShop.peek()); // John
        coffeeShop.remove(); // John is served
        coffeeShop.remove(); // Mary is served
        System.out.println(coffeeShop.element()); // Tom
        coffeeShop.remove(); // Tom is served
        coffeeShop.poll(); // Stephen is served
        try{
            coffeeShop.remove(); // This will throw an exception
        }
        catch(NoSuchElementException e){
            System.out.println("No one is in the queue"); // No one is in the queue
        }
    }
}
