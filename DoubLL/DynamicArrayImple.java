import java.util.*;
public class DynamicArrayImple {
    public static void main(String[] args){
        System.out.println("Welcome to the Dynamic Array Implementation!");
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.put(15, 9000);
    }

    public static class DynamicArray{
        int[] topScores;

        public DynamicArray(){
            topScores = new int[1];
        }

        int bucket =2;
        public int get(int bucket){
            if(bucket >= topScores.length){
                return 0;
            }
            else{
                return topScores[bucket];
            }
        }

        void put(int bucket, int value){
            if(bucket >= topScores.length){
                int updatedSize = 2*bucket;
                int[] newScores = new int[updatedSize];
                System.arraycopy(topScores, 0, newScores, 0, topScores.length);
                topScores = newScores;
                System.out.println("Array size increased to: " + updatedSize);
            }
            topScores[bucket] = value;
        }
    }


}
