package Arrays;

import Popular.UtilityClassForCoding;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargest {


    public static void main(String[] args) {


        int arr[]= UtilityClassForCoding.ARR;

        kthSmallest(arr,0,arr.length-1,3);

    }


    public static int kthSmallest(int[] arr, int l, int r, int k)
    {



        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(new MyComparator());

        for(int x :arr){

            maxHeap.add(x);


        }

        while(k>1){
            maxHeap.remove();
            k--;

        }




        return maxHeap.remove();
    } }
class MyComparator implements Comparator<Integer>
{
    public int compare( Integer x, Integer y )
    {
        return y - x;
    }
}

