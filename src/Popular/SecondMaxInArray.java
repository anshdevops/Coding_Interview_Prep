package Popular;

public class SecondMaxInArray {
    public static void main(String[] args) {
        int arr[]=UtilityClassForCoding.ARR;



        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){

                int temp=max1;
                max1=arr[i];
                max2=temp;

            }
        }

        System.out.println("Max 1 is  "+max1+" and max2 is "+max2);

    }



}
