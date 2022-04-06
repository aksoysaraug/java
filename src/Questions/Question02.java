package Questions;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {

        /*
         Type a program which calculates the cube of a number which is entered by user.
            Hint 1: Cube of a number is a x a x a
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        long num= scan.nextLong();

        System.out.println("The cube of the number is "+ num*num*num);

    }
}
