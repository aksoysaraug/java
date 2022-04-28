package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question14List {
    /*
    Find the smallest positive integer and
    greatest negative integer in a given integer list
     */
    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();
        list.add(-12);
        list.add(18);
        list.add(-5);
        list.add(23);
        list.add(-2);

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int w:      list) {
            if(w>0){
                min=Math.min(min,w);
            } else {
                max=Math.max(max,w);
            }
        }

        System.out.println("The smallest positive number is "+ min);
        System.out.println("The greatest negative number is "+ max);









    }
}
