package Popular;

import java.util.HashMap;

public class EqualNumberOfOnesAndZerosSubArray {

    // Here the tactics that can be used is to replace all zeros with -1 and then find
    // sub array which results in zero as sum. That range will be the required equal number of zeros and ones
    public static void main(String[] args) {



        int subArraySize=0;

        int arr[] = new int[]{1,1,0,1,1,0,0};

        int temp[]=arr;

        for (int x:temp) {
            if(x==0) x=-1;

        }

        HashMap<Integer,Integer> map= new HashMap<>();

        int currentSum=0;
        int maxSum=0;
        int start=0;
        int end=-1;

        int start1=0;
        int end1=-1;

        for (int i=0;i<temp.length;i++){

            currentSum+=temp[i];

            if((currentSum-maxSum)==0) {




                    start=0;
                    end=i;
                    if(subArraySize<end-start){

                        subArraySize=end-start;
                        start1=start;
                        end1=end;

                    }




            }

            if(map.containsKey(currentSum-maxSum)){




                    start = map.get(currentSum - maxSum) + 1;
                    end = i;

                if(subArraySize<end-start){

                    subArraySize=end-start;
                    start1=start;
                    end1=end;

                }
                }



            map.put(currentSum,i);
        }

        if(end==-1) System.out.println("Sub Array with equal one and zero  doesnt exists");
        else {
            System.out.println("Sub array with equal one and zero exists and index between  "+start1+" and  "+end1);
        }





    }
}
