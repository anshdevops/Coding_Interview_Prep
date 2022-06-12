package Popular;public class SecondMinInArray {

    public static void main(String[] args) {
        int arr[]=UtilityClassForCoding.ARR;



        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min1){

                int temp=min1;
                min1=arr[i];
                min2=temp;

            }
        }

        System.out.println("Min 1 is  "+min1+" and min2 is "+min2);
    }
}
