import java.util.HashMap;

//Program to check if two strings are Anagram
//Anagram are those where one string can be formed with the help of another string without using inbuild functions.
//Eg: String1 = "Silent" String2 = "Listen"
public class CheckTwoStringAreAnagram {
    public static void main(String[] args){
        String inputString1 = "silent";
        String inputString2 = "listen";

        HashMap<Character,Integer> charOcc = new HashMap<>();
        if(inputString1.length() != inputString2.length()){
            System.out.println("The given strings are not anagram");
        }
        else{
            boolean flag = true;
            for(int i = 0 ;i <inputString1.length(); i++){ //This iteration run for n loops of input string 1 so the time complexity will be O(n).
                char c = inputString1.charAt(i);
                if(charOcc.containsKey(c)){
                    charOcc.put(c, charOcc.get(c)+1);
                }else{
                    charOcc.put(c, 1);
                }
            }
            for(int i = 0; i < inputString2.length(); i++){  //This iteration run for n loops of input string 1 so the time complexity will be O(n).
                char c = inputString2.charAt(i);
                if(! charOcc.containsKey(c))
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.println("The given string are anagram");
            else
                System.out.println("The given string are not anagram");
        }
    }
//    The total time complexity will be O(n)  + O(n) = O(2n) -> O(n) considering only the highest degree of polynominal.
}
