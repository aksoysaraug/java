package Questions;

import java.util.Scanner;

public class Question03 {
    /*
   Type a program which calculates the volume of a rectangular prism whose length, width, and height are entered by user.
Hint 1: Volume of a rectangular prism is width x length x height
    */
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the lenght of the prism");
        double lenght= scan.nextDouble();

        System.out.println("Enter the width of the prism");
        double width= scan.nextDouble();

        System.out.println("Enter the height of the prism");
        double height= scan.nextDouble();

        System.out.println("The volume of the prism is "+ lenght*width*height);

    }
}
