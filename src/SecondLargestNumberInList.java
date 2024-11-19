//Program to find out the SecondLargestNumberInList using Java 8 features.
//[10,77,65,38,12,69] --> output : 69

import java.util.*;

public class SecondLargestNumberInList {
    public static void main(String[] args){
        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(10,77,65,69,38,12));
        Optional<Integer> optional = listOfNumbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        if(optional.isPresent()){
            System.out.println("The second largest Number is " + optional.get());
        }
    }
}
