package Popular;

public class InsertionSort {

    public static void main(String[] args) {

        int arr[]=UtilityClassForCoding.ARR;
        System.out.println("Before Sorting");

        for (int x:arr) System.out.print(x+" ");
        System.out.println("");

        for (int i=1;i<arr.length;i++){

            int key=arr[i];

            int j=i-1;
            while (j>=0 && arr[j]>key){


                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=key;



        }

        System.out.println("After Sorting ");

        for (int x:arr) System.out.print(x+" ");


    }
}
