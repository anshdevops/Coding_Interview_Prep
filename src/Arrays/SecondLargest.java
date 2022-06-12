package Arrays;

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr= {3,1,6,8,12,7,45,9};

        // Using Two For loops

        System.out.println("----------------- Using Two for loop -----------------");

        int firstGreatest=Integer.MIN_VALUE,secondGreatest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>firstGreatest){
                firstGreatest=arr[i];
            }
        }



        for(int i=0;i<arr.length;i++){

            if(arr[i]<firstGreatest  && arr[i]>secondGreatest){
                secondGreatest=arr[i];
            }
        }

        System.out.println(firstGreatest);
        System.out.println(secondGreatest);



        // Using Single for loop


        int firstLargest,secondLargest;

        firstLargest=arr[0];

        for(int i=1;i<arr.length;i++){

            if(arr[i]>firstLargest){
                secondLargest=firstLargest;
                firstLargest=arr[i];


            }
        }

        System.out.println("----------------- Using single for loop -----------------");
        System.out.println(firstGreatest);
        System.out.println(secondGreatest);


    }





}
