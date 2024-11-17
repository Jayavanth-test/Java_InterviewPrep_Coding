//Write a program to find out the factorial of a given number
//Factorial of a number 2 is 1 x 2 = 2
//Factorial of a number 5 is 1x2x3x4x5 = 120
public class FactorialOfAGivenNumber {
    public static void main(String[] args){
        int n = 10;
        int factorialNumber = 1;
        if(n == 0 || n == 1){ //O(1)
            System.out.println("The factorial of " + n + " is " + factorialNumber);
        }
        else{
            for(int i= 1;i<=n;i++){ // this loop runs for n iteration i.e O(n).
                factorialNumber *= i;
            }
            System.out.println("The factorial of " + n + " is " + factorialNumber);
        }
    }
    //The time complexity is O(1) + O(n) = O(n) i.e removing the constants.
}
