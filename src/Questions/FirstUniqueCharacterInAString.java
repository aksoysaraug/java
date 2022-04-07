package Questions;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        /*
        Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
        Examples:

    s = "Java is easy" return 0.

    s = "Java is easy, Java is smart.", return 8.

         */
    String s="Java is easy, Java is smart.";
    String sWithoutSpaceAndPunct=s.toLowerCase().replaceAll("[^a-z]","");

        int flag=0;

    for(int i=0; i<sWithoutSpaceAndPunct.length();i++){
        flag=0;
        if(sWithoutSpaceAndPunct.indexOf(sWithoutSpaceAndPunct.charAt(i))==sWithoutSpaceAndPunct.lastIndexOf(sWithoutSpaceAndPunct.charAt(i))){
                System.out.println(s.toLowerCase().indexOf(sWithoutSpaceAndPunct.charAt(i)));
                break;
            } else{
            flag=-1;
        }
    }

     if(flag==-1){
        System.out.println(flag);
    }

    }
}
