package Questions;

public class Question05 {

// You are a professional robber planning to rob houses along a street.
// Each house has a certain amount of money stashed, the only constraint stopping you from robbing each
// of them is that adjacent houses have security system connected and it will automatically contact the police
// if two adjacent houses were broken into on the same night.
// Given a list of non-negative integers representing the amount of money of each house,
// determine the maximum amount of money you can rob tonight without alerting the police.


            public static int rob(int[] money) {
                if(money.length == 0) {
                    return 0;
                }

                if(money.length == 1) {
                    return money[0];
                }

                int[] result = new int[money.length];

                result[0] = money[0];
                result[1] = money[0] > money[1] ? money[0] : money[1];

                for(int i = 2; i < money.length; i++) {
                    result[i] = Math.max(result[i - 2] + money[i], result[i - 1]);
                }

                return result[result.length - 1];
            }


}
