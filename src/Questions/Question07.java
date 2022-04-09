package Questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Question07 {
    public static void main(String[] args) {
        //Create a method which returns non-repeated elements from a list

    List<Integer> list= new ArrayList<>();
    list.add(7);
    list.add(7);
    list.add(5);
    list.add(6);
    list.add(6);

    uniqueElements(list);
        System.out.println(uniqueElements02(list));
    }
    public static void uniqueElements(List<Integer> list){
        HashSet<Integer> hs= new HashSet<>();
        for (int w: list) {
            hs.add(w);
        }

        System.out.println(hs);
    }

    public static List<Integer> uniqueElements02(List<Integer> list){
        List<Integer> unique= new ArrayList<>();
        for (int w: list){
            if(unique.contains(w)){
                continue;
            } else{
                unique.add(w);
            }
        }
        return unique;
    }


    }
