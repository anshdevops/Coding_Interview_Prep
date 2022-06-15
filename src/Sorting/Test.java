package Sorting;

import Popular.UtilityClassForCoding;

public class Test {

    public static void main(String[] args) {
        int arr[]= UtilityClassForCoding.ARR;

        bubbleSort(new int[]{2,4,-1,-5,5,7,-8});
        insertionSort(new int[]{2,4,-1,-5,5,7,-8});
        selectionSort(new int[]{2,4,-1,-5,5,7,-8});
      //  countingSort(new int[]{2,4,-1,-5,5,7,-8});
      //  binaryySearch(arr,7);
    }

    private static void binaryySearch(int[] arr, int i) {
    }

    private static void countingSort(int[] arr) {
    }

    private static void selectionSort(int[] arr) {
    }

    private static void insertionSort(int[] arr) {


        System.out.println("Insertion Sort");
        beforeSorting( arr);

        for(int i=1;i<arr.length;i++){

            int key=arr[i];
            int j=i-1;

            while (j>=0 && key<arr[j] ){

                arr[j+1]=arr[j];
                j--;


            }

            arr[j+1]=key;


        }

        printAfterSorting(arr);


    }

    private static void beforeSorting( int[] arr) {
        System.out.println("Array_Before_Sorting_");
        System.out.println("");
        for (int x: arr
             ) {
            System.out.print(x);
        }
        System.out.println("");
    }

    private static void printAfterSorting(int[] arr) {
        System.out.println("After Sorting");
        System.out.println("");
        for (int x: arr
        ) {
            System.out.print(x);
        }
        System.out.println("");
    }

    private static void bubbleSort(int[] arr) {

        System.out.println("Bubble Sort");
        beforeSorting(arr);


        System.out.println("-----------------------------------");

        for (int i=arr.length-1;i>0;i--){

            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]) {


                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }



            }
        }

        printAfterSorting(arr);
    }
}
