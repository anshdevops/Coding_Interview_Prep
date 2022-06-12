package Popular;

import java.util.HashMap;

public class Anagram {

    public static void main(String[] args) {
        // One Approach could be to sort it in OlogN complexity and then compare each indexes;
        // Best approach would be  to use HashMap that would solve it in O n  complexty.

        String anam1="ANSHUL";
        String anam2="LUYHNA";
        boolean isAnagram=true;
        if(anam1.length()!=anam2.length()) System.out.println("Not anagram");

        HashMap<Character,Integer> map=new HashMap<>();

        for (int i=0;i<anam1.length();i++){

            if (!map.containsKey(anam1.charAt(i))){
                map.put(anam1.charAt(i),1);
            }else {
                map.put(anam1.charAt(i),map.get(anam1.charAt(i))+1);
            }

        }

        System.out.println("Values in Map are");
        map.forEach((x,y)-> System.out.println("Key is "+x+" Value is "+y));

        for (int i=0;i<anam2.length();i++){

            if (map.containsKey(anam2.charAt(i))){

                map.put(anam2.charAt(i),map.get(anam2.charAt(i))-1);

            }
        }

        for (Character x:map.keySet()){

            System.out.println(x+" "+map.get(x));
            int count=map.get(x);
            if(count>0) {
                isAnagram=false;
                break;

            }









        }
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");

        if(isAnagram) System.out.println("Anagram");
        else System.out.println("Not Anagram");

    }
}
