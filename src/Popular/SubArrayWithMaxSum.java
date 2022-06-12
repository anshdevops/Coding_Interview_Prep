package Popular;


public class SubArrayWithMaxSum {
    public static void main(String[] args) {


      int   arr[] = {-1,-2,-3,-4};


      int maxSum=Integer.MIN_VALUE;
      int currSum=0;

        for (int i = 0; i < arr.length; i++) {
            currSum+=arr[i];
            if(currSum>maxSum) maxSum=currSum;

            if(currSum<0) currSum=0;
        }


        System.out.println("Max sum is "+maxSum);


    }
}
