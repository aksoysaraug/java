package Questions;

import java.util.Arrays;

public class PrintDuplicatesInAString {

    public static void main(String[] args) {

        String str = "Java is easy";

        //1. Way:
        String withoutSpace = str.replaceAll(" ", "");

        String duplicateCharacters = "";
        for (int i = 0; i < withoutSpace.length(); i++) {
            if (withoutSpace.lastIndexOf(withoutSpace.charAt(i)) != withoutSpace.indexOf(withoutSpace.charAt(i)) &&
                    !duplicateCharacters.contains(withoutSpace.substring(i, i + 1))) {
                duplicateCharacters += withoutSpace.charAt(i) + ",";
            }
        }
        System.out.println("Result from 1. Way: "+duplicateCharacters);

        //2. Way:
        String arr[]=str.replaceAll(" ","").split("");

        String container="";

        for (int i=0;i< arr.length;i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].equals(arr[j]) && !container.contains(arr[i])) {
                    container += arr[i] + ","; //a s
                }
            }
        }
        System.out.println("Result from 2. Way: "+container);
    }

}
