package Questions;

import java.util.Scanner;

public class PalindromeNumber {

    static int sum=0,rem;


    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number ");
        int originalNum= scan.nextInt();

        isPalindrome01(originalNum);

    }

    public static void isPalindrome01(int num){
        if(num==reverse(num)){
            System.out.println("Number is Palindrome");
        } else{
            System.out.println("Number is not Palindrome");
        }

    }

    public static int reverse(int num){
        int remainder=0;
        int reverse=0;
       while(num!=0){
           remainder=num%10;
           reverse=reverse*10+remainder;
           num=num/10;
       }
       return reverse;
    }

}
