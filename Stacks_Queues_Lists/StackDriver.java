public class StackDriver {
    public static void main(String[] args) {
        int plate;
        StackImple lottaPlates = new StackImple();
        plate = 25;
        for(int i =plate; i < 150; i++){
            lottaPlates.push(i+5);
        }
        if(lottaPlates.isEmpty()){
            System.out.println("The stack is empty");
        }else{
            System.out.println("Peeking the top plate: " + lottaPlates.peek());
            System.out.println("The size of the stack is: " + lottaPlates.size());
            System.out.println("Popping the top plate: " + lottaPlates.pop());
        }

    }
}
