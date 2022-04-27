package ReplitQuestions;

import java.util.Scanner;

public class Question06ReverseNumber {

    public static void main(String[] args) {

    /*
    Write a java program to reverse the number which user entered.

    Input :1238
    Output :Reverse Of The Number: 8321
     */
        Scanner scan= new Scanner (System.in);
        System.out.println("Enter a number");
        int num= scan.nextInt();
        System.out.println(convertToReverse01(num));

        System.out.println(convertToReverse02(num));

    }
    public static int convertToReverse01 (int num) {

        int reverse=0;
        for (int i=num; i>0; i=i/10){

            reverse = reverse*10 + i%10;

        }
        return reverse;
    }

    public static int convertToReverse02(int num){
        String reverse="";
        for (int i=num; i>0; i=i/10){
            reverse+= i%10;
        }

        return Integer.valueOf(reverse);
    }

}
