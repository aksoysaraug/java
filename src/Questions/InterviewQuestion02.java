package Questions;

public class InterviewQuestion02 {
    public static void main(String[] args) {

        // Write a program to find the middle element of an array

        int arr[]= {12, 22, 34, 22, 54, 6, 52, 8, 9, 34, 54, 68, 10, 20, 30};

        findMiddleElement(arr);

    }

    public static void findMiddleElement(int arr[]) {
        int midIndex = (arr.length-1)/2;
        System.out.println("The mid index is "+midIndex+" and the element at mid is "+ arr[midIndex]);
    }
}