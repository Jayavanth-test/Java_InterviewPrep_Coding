//Write a program to check if a string is Palindrome.
//What is Palindrome?
//Palindrome is a word, sentence, or even number which can be read back and forward.
//Example: Input : madam Ouput : madam it is a palindrome.
//Implemented using the two pointer approach using array to compare it.
public class CheckIfAStringIsPalindrome {
    public static void main(String[] args){
        String inputString = "Web";
        if(checkPalindrome(inputString)){
            System.out.println("The given String is Palindrome");
        }
        else{
            System.out.println("The given String is not Palindrome");
        }
    }

    public static boolean checkPalindrome(String inputString){
        int startIndex = 0;
        int endIndex = inputString.length()-1;
        char[] charArray = inputString.toCharArray();

        //it executed for half of the string i.e n/2 so time complexity of while loop is O(n/2).
        while(startIndex < endIndex){
            if(charArray[startIndex] == charArray[endIndex]){
                startIndex++;
                endIndex--;
            }else{
                return false;
            }
        }
        return true;
    }
//The final Time complexity of while loop is O(n).
}
