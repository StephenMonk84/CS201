import java.util.*;

public class SetImple {
    public static void main(String[] args){
        Set<Double> setTest = new TreeSet<>();
        setTest.add(1.0);
        setTest.add(2.0);   
        setTest.add(3.0);
        setTest.add(4.0);

        Iterator<Double> iter = setTest.iterator();
        while(iter.hasNext()){
            Double value = iter.next();
            System.out.println(value);
        }
    }
}
