package Popular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllNegativeElementsToEndWithoutChangingOrder {
    public static void main(String[] args) {

        segregateElements(new int[]{2,4,-1,-5,5,7,-8},7);

    }

    public static void segregateElements(int[] arr, int l)
    {



        List<Integer> positive= new ArrayList<>();
        List<Integer> negative= new ArrayList<>();

        int counter=0;


        for(int i=0;i<arr.length;i++){

            if(arr[i]>0){


                positive.add(arr[i]);

            }
            else{


                negative.add(arr[i]);
            }
        }

        for(int i=0;i<positive.size();i++){
            arr[counter]=positive.get(i);
            counter++;
        }

        for(int i=0;i<negative.size();i++){
            arr[counter]=negative.get(i);
            counter++;
        }


        for (int x:arr) System.out.println(x);



    }

}
