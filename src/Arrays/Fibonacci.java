package Arrays;

public class Fibonacci {
    public static void main(String[] args) {

        int first=0;
        int second=1;
        System.out.println(first);
        System.out.println(second);
        for(int i=0;i<20;i++){

            int third=first+second;
            int temp=second;
            second=third;
            first=temp;
            System.out.println(third);
        }




    }
}
