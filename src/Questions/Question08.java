package Questions;

public class Question08 {

//        Write a method that can divide two numbers without using division operator

    public static void division(int num1, int num2){
        int counter=0;
        if(num2==0){
            System.out.println("Number cannot divide by zero");
        } else {
            for (int i = 1; i <= num1; i++) {
                if (i % num2 == 0) {
                    counter++;
                }
            }
            int remainder= num1-num2*counter;
            System.out.println(counter+" with a remainder of "+ remainder);
        }
    }

}
