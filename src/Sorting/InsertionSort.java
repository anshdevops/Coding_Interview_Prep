package Sorting;

public class InsertionSort {


   static int[] elements ={9,6,1,4,5,7,2,3};
   static void sort(int arr[])
    {


        //{ 6 9 1 4 5 7 2 3}

        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

        }
    }
 
    public static void main(String[] args) {

        for (int x: elements
             ) {
            System.out.print(x);
        }

        System.out.println("");
        System.out.println("After Sorting");
        sort(elements);
        for (int x: elements
        ) {
            System.out.print(x);
        }

    }

}
