package ReplitQuestions;

public class Question01 {
    public static void main(String[] args) {
        /*
        Type a program to convert DOUBLE to integer.
        Don't use type casting.
         */

        double d = 15.89;
        System.out.println(toInteger(d));
        System.out.println(toIntegerWithRounding(d));

    }

    public static int toInteger(double num) {
        String s = Double.toString(num);
        int idx = s.indexOf(".");
        int result = Integer.valueOf(s.substring(0, idx));
        return result;
    }

    public static long toIntegerWithRounding(double num) {
        long result = Math.round(num);
        return result;
    }
}