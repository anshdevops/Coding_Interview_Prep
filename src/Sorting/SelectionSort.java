package Sorting;

public class SelectionSort {

    public static void main(String[] args) {


        int[] array =new int[]{2,4,-1,-5,5,7,-8};

        for (int i=0;i<array.length-1;i++){

            int minIndex=i;

            for(int j=i+1;j<array.length;j++){

                if(array[j]<array[minIndex]){
                    minIndex=j;

                }
                int temp=array[i];
                array[i]=array[minIndex];
                array[minIndex]=temp;
            }
        }


        System.out.println("After Sorting");
        System.out.println("");
        for (int x: array
        ) {
            System.out.print(x);
        }
        System.out.println("");
    }
}
