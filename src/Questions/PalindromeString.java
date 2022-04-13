package Questions;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        /*
*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
Given a string A, print Yes if it is a palindrome, print no otherwise.
*
* Constraints
* A will consist at most 50 lower case english letters.
* */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=scan.nextLine();

        isPalindrome(s);

    }
    public static void isPalindrome(String s){
        if(s.equals(reverse(s))){
            System.out.println("Given String is Palindrome.");
        }else{
            System.out.println("Given String is not Palindrome.");
        }
    }

    public static String reverse(String s){
        String rvrs="";
        for(int i=s.length()-1;i>-1;i--){
            rvrs+=s.charAt(i);
        }
        return rvrs;
    }
}
