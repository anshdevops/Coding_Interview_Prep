package Popular;

import java.util.*;

public class Testt {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String s1=scn.next();

        ArrayList<Integer> list=new ArrayList<>();
        System.out.println();
        Map<Integer,Integer> map=new HashMap<>();
        map.forEach((k, v) ->

                {


                    System.out.println((k + ":" + v));
                    if (v>1){
                        list.add(k);

                    }

                }


        );



    List<String>  sampleNames=new ArrayList<>();
        sampleNames.add("Anshul");
        sampleNames.add("Ankit");
        sampleNames.add("Shubham");

        if(sampleNames.contains(s1)){

            a();
        }
        else {
            b();
        }
    }
    static void  a(){
        System.out.println("Human name");
    }
    static void b(){
        System.out.println("Non Human Name");
    }
}
