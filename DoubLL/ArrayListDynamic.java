import java.util.*;
public class ArrayListDynamic {
    public static void main(String[] args){
        ArrayList<Integer> topScores = new ArrayList<>();
        int buckets = 15;
        int userScore =500;
        for(int i=0;i<buckets;i++){
            double tmp = userScore*(1.5*i);
            int temp = (int) tmp;
            
            topScores.add(temp);
        }
        topScores.add(0, 1000); // Add 1000 at the beginning of the list
        topScores.add(1, 1100); // Add 1100 at the second position of the list
        topScores.add(2, 1200); // Add 1200 at the third position of the list
        topScores.add(3, 1300); // Add 1300 at the fourth position of the list

        for(int i=0;i<topScores.size();i++){
            System.out.println("Top Scores: " + topScores.get(i));
        }
    }
}
