package Popular;

public class BubbbleSort {


    public static void main(String[] args) {
        int arr[]=UtilityClassForCoding.ARR;


        for(int i=0;i<arr.length-1;i++){

            for(int j=1;j<arr.length;j++){

                if(arr[j-1]>arr[j]){

                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;


                }


            }

        }

        for (int x:arr) System.out.println(x);
    }
}
