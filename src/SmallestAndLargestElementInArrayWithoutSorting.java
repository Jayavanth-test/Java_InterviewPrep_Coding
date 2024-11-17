//Program to find the largest and smallest element in array without sorting it.
//input : [1,2,6,0,4] output : min = 0, max = 6
public class SmallestAndLargestElementInArrayWithoutSorting {
    public static void main(String[] args){
        int[] inputArray= {-1,1,2,6,0,4,3,9};
        int min = inputArray[0];
        int max = inputArray[0];
        for(int i : inputArray){ //runs for n iterations so time complexity will be O(n).
            if(max < i) max = i;
            if(min > i) min = i;
        }
        System.out.println("The Maximunm and Minimum elements in Array are " + max + " and " + min);
    }
    //overall Time Complexity will be O(n).
}
