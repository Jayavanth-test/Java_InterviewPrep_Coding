//Write a Java Program to print the Nth Fibanonical Series number
//fibanonical Series is a series of number where fn = fn-1 + fn-2
//Fibanonical Series Numbers 0,1,1,2,3,5,8...
//where f3 = 2 i.e it starts with f0.
public class FibanonicalSeriesNthNumber {
    public static void main(String[] args){
        int n = 9;
        int previous = 1;
        int previousBefore = 0;
        int initialCount = 2;
        int next = 0;
        if(n == 1)
            System.out.println("The fibanonical Series on 1st position : "+ previousBefore);
        else if(n == 2)
            System.out.println("The fibanonical Series on 2nd position : "+ previous);
        else {
            //This loops runs for n-2 so removing the constants will he O(n).
            while (initialCount < n) {
                next = previousBefore + previous;
                previousBefore = previous;
                previous = next;
                initialCount++;
            }
            System.out.println("The fibanonical Series on the position " + n +" is : "+ next);
        }
//Total Time Complexity will be O(n).
    }
}
