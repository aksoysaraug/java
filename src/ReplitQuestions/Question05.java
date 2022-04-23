package ReplitQuestions;

public class Question05 {
    String name="Ali";
    public Question05(){

    }
    public Question05(String name){
        this.name=name;
    }
    public static void main(String[] args) {
        Question05 obj1= new Question05();
        Question05 obj2= new Question05("Ayse");

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}

