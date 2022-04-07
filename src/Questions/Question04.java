package Questions;

import java.util.*;

public class Question04 {
    public static void main(String[] args) {
        /*
    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    Example:
    Given nums = [8, 7, 11, 15], target = 18,

    Because nums[1] + nums[2] = 7 + 11 = 18,
    return [1, 2].
*/
        int num[] = {8, 7, 11, 15};
        System.out.println(Arrays.toString(sumOfTwo(num, 18)));
        System.out.println(sumOfTwo02(num,18));

    }

//    1. Way:
    public static int[] sumOfTwo(int arr[], int target) {
        Map map = new HashMap<>();
        int result[] = new int[2];
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

//    2.Way:
    public static Collection sumOfTwo02(int arr[], int target) {
        Map map = new HashMap<>();
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    map.put(arr[i], i);
                    map.put(arr[j], j);
                }
            }
        }
        return map.values();

    }
}