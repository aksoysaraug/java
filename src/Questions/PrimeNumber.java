package Questions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        /*
	 	Print prime numbers which are less than the given number
	*/
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan.nextInt();

        printPrime(num);

    } public static void printPrime(int num){
        for (int i=2;i<num;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int num){
        for(int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
