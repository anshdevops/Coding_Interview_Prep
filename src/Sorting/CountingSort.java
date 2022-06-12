package Sorting;

public class CountingSort {
    public static void main(String[] args) {


        int arr[]={4,2,2,8,3,3,1};

        int max=findMax(arr);
        System.out.println("Max is : "+max);

        int newArray[] = new int[max+1];


        for(int i=0;i<arr.length;i++){



            int count=newArray[arr[i]];
            newArray[arr[i]]=count+1;


        }
        for (int X: newArray
             ) {
            System.out.print(X);
        }

        System.out.println("");
        // performing cumulative sum

        for (int i=0;i<newArray.length-1;i++){


            newArray[i+1]=newArray[i]+newArray[i+1];


        }
        for (int X: newArray
        ) {
            System.out.print(X);
        }

        // Now let find index of each element in first array and then subtract by one each time.

        int output[]=new int[arr.length];

        for (int i=0 ;i<arr.length;i++){

            int element=arr[i];
            int valueInSecondArray=newArray[element];
            int  finalIndexInNewArray=valueInSecondArray-1;
            newArray[element]=valueInSecondArray-1;
            output[finalIndexInNewArray]=arr[i];


        }
        System.out.println(" Counting Sort Sorted Array is ");
        for (int X: output
        ) {
            System.out.print(X);
        }

    }

    private static int findMax(int[] arr) {


        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return  max;
    }
}
