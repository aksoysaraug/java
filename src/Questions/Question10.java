package Questions;

public class Question10 {
        /*
How we can prevent an object creation except defining it abstract.
Also This class must allow only one copy of itself.
There must be only one copy of it and every other objects and classes
in the project must use that copy.
 */
        private static Question10 instance = new Question10();

        public String user;

        public static void main(String[] args) {
                Question10 q1 = new Question10();
        }

        public static Question10 getInstance(){
                return instance;
        }

        private Question10() {
        }


}
