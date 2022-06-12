package Popular;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInArray {


    public static void main(String[] args) {

        duplicates(new int[]{2, 3, 1, 2, 3},5);
    }


    public static ArrayList<Integer> duplicates(int arr[], int n) {


        HashMap<Integer,Integer> map= new HashMap<>();


        ArrayList<Integer> list=new ArrayList<>();


        for(int i =0;i<arr.length;i++){

            if(map.containsKey(arr[i])){

                map.put(arr[i],map.get(arr[i])+1);
            }
            else{

                map.put(arr[i],1);

            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue()>1) list.add(entry.getKey());


            }


        }

        map.forEach((k,v)-> System.out.println("Key is  "+k+" Value is "+v));

        if(!list.isEmpty()) {
        }
        else {

            list.add(-1);
        }
        return list;


    }
}
