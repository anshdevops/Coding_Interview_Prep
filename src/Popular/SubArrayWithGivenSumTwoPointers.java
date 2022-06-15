package Popular;

public class SubArrayWithGivenSumTwoPointers {

    public static void main(String[] args) {
        int arr[]={1,2,3,7,5};


        int left=0;
        int right=0;
        int givenSum=12;

        int currentSum=0;

        for (int i=0;i<arr.length;i++){


            if(currentSum==givenSum)  System.out.println("Starting and Ending indexes  of given sum are "+left+ "  "+right);
            currentSum+=arr[i];


            if(currentSum<givenSum) right++;

            else if(currentSum>givenSum){
                currentSum-=arr[left];
                left++;
            }




        }


    }
}
