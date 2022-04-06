import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {

/*
Type a program which calculates the area and the perimeter of a square whose side length is entered by user.
Hint 1: Area of a square is length x length
Hint 2: Perimeter of a square is 4x length
 */
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the lenght of the square");
        double area= scan.nextDouble();

        System.out.println("The area of the square is " + area*area);

        System.out.println("The perimeter of the square is " + 4*area);

    }
}
