package Questions;

public class Question11 {
    public static void main(String[] args) {
        System.out.println("Hello World");
/*
Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

Örnek Çıktı:

Alan: 32

Çevre: 24
 */
        int a= 8;
        int b= 4;
        Question11 obj= new Question11();
        obj.cevreAlan(a,b);

    } public void cevreAlan(int a, int b){
        System.out.println("Alan: "+a*b);
        System.out.println("Cevre: "+ 2*(a+b));
    }

}
