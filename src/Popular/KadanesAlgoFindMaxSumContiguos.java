package Popular;

public class KadanesAlgoFindMaxSumContiguos {
    public static void main(String[] args) {

        System.out.println(maxSubarraySum(new int[]{1,2,3,-2,5},5));


    }

   static long maxSubarraySum(int a[], int n){

        long maxSum = Long.MIN_VALUE;
        long curSum = 0;

        for(int i =0 ; i<n ; i++)
        {


            curSum+=a[i];

            if(curSum>maxSum) maxSum=curSum;

            if(curSum<0) curSum=0;




        }

        return maxSum;


    }

}
