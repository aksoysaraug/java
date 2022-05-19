package ReplitQuestions;

import java.util.Scanner;

public class Question09 {
    /*
    Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int num= scan.nextInt();

        System.out.println(kupunYarisi(num));

    }

    public static double kupunYarisi(int num){
        return num*num*num/2.0;
    }
}
