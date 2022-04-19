package Questions;

import java.util.*;

public class InterviewQuestion01 {
    /*
interview question: find duplicates and uniques in a string!
 */
    public static void main(String[] args) {
        String str="XXXYZZMNOO";
        System.out.println("Duplicate elements are "+findDuplicates(str));
        System.out.println("Unique elements are "+findUniques(str));
        findUniquesAndDuplicates(str);
    }

    public static Set<String> findDuplicates(String s){
        String sWithoutSpace= s.replaceAll(" ","");
        Set<String> duplicates=new HashSet<>();
        for(int i=0; i<sWithoutSpace.length();i++){
            if (sWithoutSpace.indexOf(sWithoutSpace.charAt(i))!=sWithoutSpace.lastIndexOf(sWithoutSpace.charAt(i)))
       duplicates.add(sWithoutSpace.substring(i,i+1));
        }
        return duplicates;
    }
    public static Set<String> findUniques(String s){
        String sWithoutSpace= s.replaceAll(" ","");
        Set<String> duplicates=findDuplicates(s);
        Set<String> uniques=new HashSet<>();
        for (int i=0; i<sWithoutSpace.length();i++){
            if (!duplicates.contains(sWithoutSpace.substring(i,i+1))){
                uniques.add(sWithoutSpace.substring(i,i+1));
            }
        }
        return uniques;
    }
    public static void findUniquesAndDuplicates (String s){
        String sWithoutSpace= s.replaceAll(" ","");
        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<sWithoutSpace.length();i++){
            if(!map.containsKey(sWithoutSpace.charAt(i))){
                map.put(sWithoutSpace.charAt(i),1);
            } else{
                map.put(sWithoutSpace.charAt(i),map.get(sWithoutSpace.charAt(i))+1);
            }
        }
        LinkedList<Character> uniques=new LinkedList<>();
        LinkedList<Character> duplicates=new LinkedList<>();

        for (Character w: map.keySet() ) {
            if (map.get(w)==1){
                uniques.add(w);
            } else{
                duplicates.add(w);
            }
        }
        System.out.println("Unique elements are "+ uniques);
        System.out.println("Duplicate elements are "+ duplicates);
    }



}
