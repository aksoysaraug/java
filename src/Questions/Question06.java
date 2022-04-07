package Questions;

import java.util.HashMap;

public class Question06 {
    public static void main(String[] args) {
//        Given an array of integers, find if the array contains any duplicates. Your function should return
//true if any value appears at least twice in the array, and it should return false if every element is distinct.
    }
//  1. Way:

    public static boolean containsDuplicate(int arr[]){
        boolean result=false;
        int counter=0;
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    result=true;
                }
            }
        }

        return result;
    }
    //    2.Way:
    public static boolean containsDuplicate02(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int w: arr) {
            if(map.containsKey(w)) {
                return true;
            } else {
                map.put(w, 1);
            }
        }

        return false;
    }
}
