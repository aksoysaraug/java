package Questions;

public class Question13 {
    public static void main(String[] args) {
        /*
        Write java code checking the number is Perfect number or not.
Any number can be a Perfect Number if the sum of its positive divisors excluding the number itself is equal to that number.
Input :6 Output:6 is Perfect Number Input :7 Output:7 is not Perfect Number
         */
        isPerfectNumber(7);

    }
    public static void isPerfectNumber(int num){
        int sum=0;
        for (int i=1; i<num; i++){
            if (num%i==0){
                sum+=i;
            }
        }
        if (num==sum){
            System.out.println(num+" is Perfect Number");
        } else
        System.out.println(num+" is not Perfect Number");
    }
}
