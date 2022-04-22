package ReplitQuestions;

import java.util.ArrayList;
import java.util.List;

public class Question02 {
    public static void main(String[] args) {
        /*

Write a Program to find the sum of natural numbers from 1 to 100.

OUTPUT : Sum of Natural Numbers 5050
         */
        int num=100;
        System.out.println("Sum of Natural Numbers "+sumOfNatural(num));
    }
    public static int sumOfNatural(int num){
        List<Integer> list= new ArrayList<>();
        for (int i=1; i<=num; i++){
            list.add(i);
        }

        int sum= list.stream().reduce(0,Math::addExact);
        return sum;
    }


}
