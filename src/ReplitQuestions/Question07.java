package ReplitQuestions;

public class Question07 {

    static double pi=3.14;

    public static void main(String[] args) {

        /*
       Dairenin alanini ve cevresini hesaplayan java kodunu yaziniz.
        r=7;
        Pi=3.14
        Ipucu:
        Dairenin Cevresi : 2Pir
        Dairenin Alani : Pirr
        Ornek Cikti:
        43.96
        153.86
 */
        System.out.println(daireninAlani(7));
        System.out.println(daireninCevresi(7));


    }
     public static double daireninAlani(int r){
            return r*r*pi;
     }

    public static double daireninCevresi(int r){
        return 2*pi*r;
    }

}
