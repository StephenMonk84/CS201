import java.util.*;

public class Seq {
    
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4,5,6,7,8,9,10};

        System.out.println("The index of the number 6 is " + seqSearch(a, 6));

    }





    public static int seqSearch(int[] a, int n){
       int i = 0;
        while (i < a.length){
            if (a[i] == n){
                return i;
            }
            i++;
        } 
       return -1;
    }
}
