//Program to get constants and Vowels in a given string.
//input : Welcome : Constants : 4 , Vowels : 3.
public class ConstantsAndVowelsInAString {
    public static void main(String[] args){
        String inputString = "Welcome to Virtusa";
        char[] charArray = inputString.toCharArray();
        int vowels = 0;
        int constants = 0;
        for(char ch : charArray){ // The loops iterates for lenght of string n so the time complexity will be O(n).
            if(Character.isLetter(ch)){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' || ch=='u')
                    vowels++;
                else
                    constants++;
            }
        }
        System.out.println("The Vowels " + vowels);
        System.out.println("The Constants " + constants);
    }
    //The Time Complexity will be O(n).
}
