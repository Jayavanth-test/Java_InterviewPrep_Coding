//Reverse a Given String Without using Build in Functions in Java
//Input : "Welcome" OutPut : "emocleW"
//We are going to use the two pointer approach and swapping technique to do this.
public class ReverseStringWithoutBuildInFunctionTwoPointer {
    public static void main(String[] args){
        String inputString = "Welcome";
        String outputString ;
        int startIndex = 0;
        int endIndex = inputString.length()-1;

        // each character in string to be copied into an array so it runs through one iteration internally so the complexity will be O(n).
        char[] charArray = inputString.toCharArray();

        //the while loop runs for the iteration of half of the length of String so it would O(n/2) -> O(n) ( we can ignore the constants).
        while(startIndex < endIndex){
            char temp = charArray[startIndex];
            charArray[startIndex] = charArray[endIndex];
            charArray[endIndex] = temp;
            startIndex++;
            endIndex--;
        }

        //Again this each char in the array to be copied into string so again the iteration would be O(n).
        outputString = String.valueOf(charArray);
        System.out.println("The Reversed String is "  + outputString);

    }
}

//So total time complexity would be O(n) + O(n) + O(n) = O(3n) -> O(n) (removing the constants) (considering only the highest degree of polynominal).
