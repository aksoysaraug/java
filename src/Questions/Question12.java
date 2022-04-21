package Questions;

import java.util.Arrays;

public class Question12 {
//    Ask user to enter a name and a character, then check how many times the character
//    is repeated in the name using loops in the name
//      e.g: char ch1= 'a' ;
//      String name =“John came late";
//  Expected Output: Number of a = 2
    public static void main(String[] args) {

        String name= "John came late";
        char ch='a';

        char crr[]=name.toCharArray();
        System.out.println(Arrays.toString(crr));
        int count=0;
        for (char w: crr ){
            if (w==ch){
                count++;
            }
        }

        System.out.println("Number of "+ ch+ " = "+ count);
    }

}
