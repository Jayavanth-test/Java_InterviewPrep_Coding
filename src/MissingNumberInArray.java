//Find the missing number in the given array with inputs
//1. arr - of size n-1 with integers range from  [1, n]
//2.  n - size of an array.
//3. There are no duplicates in the list.
//Input: arr[] = {1, 2, 4, 6, 3, 7, 8} , n = 8
//Output: 5

import java.util.Arrays;
import java.util.List;

public class MissingNumberInArray {
    public static void main(String[] args){
        int[] arrayOfNumbers = {1,2,4,10,3,7,5,8,9};
        int n = 10;
        int i;
        for( i = 1 ; i <= n; i++){      // n times
            if(searchElementInArray(i, arrayOfNumbers))
                continue;
            else
                break;
        }
        System.out.println("The Missing Element is :" + (i));
        getMissingNumber(n, arrayOfNumbers);
    }

    public static boolean searchElementInArray(int element, int[] arr){
        boolean flag = false;
        for(int i = 0 ; i < arr.length ; i ++){   //(n-1) + 1
            if(arr[i] == element)
                flag = true;                    // n
        }
        return flag;
    }

    public static void getMissingNumber(int n , int[] arr){
        int sum = 0;
        for(int a = 0 ; a < arr.length ; a++){
            sum += arr[a];
        }
        int actualSum = (n * (n+1))/2;
        System.out.println("The Missing Element is :"+ (actualSum - sum));
    }

}

//Time Complexity is O(n2)
//We can use the sum of n natural number to get the expected sum and actual sum
