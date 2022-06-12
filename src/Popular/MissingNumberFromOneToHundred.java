package Popular;

public class MissingNumberFromOneToHundred {

    public static void main(String[] args) {
        int arr[]= new int[100];
        for(int i=0;i<arr.length;i++){

            arr[i]=i+1;
        }

        int numberMissing=20;
        arr[numberMissing]=0;

        int naturalSum=(arr.length*(arr.length+1))/2;


        System.out.println("Total sum is "+naturalSum);

        for(int i=0;i<arr.length;i++){

            naturalSum-=arr[i];

        }

        System.out.println("Missing Number is "+(naturalSum-1));
    }
}
