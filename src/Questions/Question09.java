package Questions;

public class Question09 {
    public static void main(String[] args) {
        /*
 Calculate addition of odd numbers from 1 to 40
 except 5 and multiply of 5
 */

        sumOfOddNumbersExceptFive();

    } public static void sumOfOddNumbersExceptFive(){
        int sum=0;
        for (int i=1;i<40; i=i+2){
            if(i%5!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
