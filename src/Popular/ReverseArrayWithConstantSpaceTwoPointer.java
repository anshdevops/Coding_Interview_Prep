package Popular;

public class ReverseArrayWithConstantSpaceTwoPointer {
    public static void main(String[] args) {
        // We can use two pointer based solution

        // it's in place way


        System.out.println("Before reversing");

        int arr[]=UtilityClassForCoding.ARR;

        for (int x:arr) System.out.print(" "+x+" ");
        System.out.println("");

        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----------------");


        int left=0;
        int right= arr.length-1;

        while (left<right){

            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;

        }


        for (int x:arr) System.out.print(" "+x+" ");

    }
}
