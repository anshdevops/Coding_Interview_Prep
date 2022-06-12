package Sorting;

import Popular.UtilityClassForCoding;

public class Test {

    public static void main(String[] args) {
        int arr[]= UtilityClassForCoding.ARR;

        bubbleSort(arr);
        insertionSort(arr);
        selectionSort(arr);
        countingSort(arr);
        binaryySearch(arr,7);
    }

    private static void binaryySearch(int[] arr, int i) {
    }

    private static void countingSort(int[] arr) {
    }

    private static void selectionSort(int[] arr) {
    }

    private static void insertionSort(int[] arr) {

        for(int i=1;i<arr.length;i++){

            int key=arr[i];
            int j=0;

            while (j>=0 && key<arr[i] ){

            }


        }


    }

    private static void bubbleSort(int[] arr) {
    }
}
