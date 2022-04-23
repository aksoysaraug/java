package ReplitQuestions;

import java.util.HashSet;
import java.util.Set;

public class Question03 {
    public static void main(String[] args) {
        /*
        Write a code that returns the duplicate chars in a String array.(interview Question)

        Input :

        String str=“Javaisalsoeasy”

        Output: [a, s]
        */
        String str="Javaisalsoeasy";
        System.out.println(duplicate(str));
    }
    public static Set<Character> duplicate(String s){
        HashSet<Character> set= new HashSet<>();
        for (int i=0; i<s.length();i++){
            if (s.indexOf(s.charAt(i))== s.lastIndexOf(s.charAt(i))){
                continue;
            } else{
                set.add(s.charAt(i));
            }
        }
        return set;
    }

}
