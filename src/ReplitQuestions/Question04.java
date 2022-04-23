package ReplitQuestions;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        /*
        Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
Input :
30 and 40
Expected OutPut:
GCD for 30 and 40 = 10
LCM for 30 and 40 = 120
         */
    Scanner scan= new Scanner(System.in);
        System.out.println("Enter first number");
        int num1= scan.nextInt();

        System.out.println("Enter second number");
        int num2= scan.nextInt();

        System.out.println("GCD for "+num1+" and "+num2 +" = "+findGCD(num1, num2));
        System.out.println("LCM for "+num1+" and "+num2 +" = "+findLCM(num1, num2));

    }

    public static int findGCD(int a, int b){
        int result=0;
        int end=0;
        if (a>b){
            end=b;
        } else{
            end=a;
        }
        for (int i=2; i<end; i++){
            if (a%i==0 && b%i==0){
                result=i;
            }
        }
        return result;
    }

    public static int findLCM(int a, int b){
        int result=0;
        for (int i=a*b; i>a; i--){
            if (i%a==0 && i%b==0){
                result=i;
            }
        }
        return result;
    }
}
