package Popular;

public class SwapTwoNumsWithtThird {
    public static void main(String[] args) {

        int a =10;
        int b =20;

        /*
        * b=b+a
        * a=b-a;
        * b=b-a
        * */


        System.out.println(" A and B before swapping "+a+"  "+b);

        b=b+a;
        a=b-a;
        b=b-a;


        System.out.println(" A and B after swapping  "+a+"  "+b);




    }
}
