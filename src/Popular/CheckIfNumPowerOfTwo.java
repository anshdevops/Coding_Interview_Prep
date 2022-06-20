package Popular;

public class CheckIfNumPowerOfTwo {

    public static void main(String[] args) {
        float n=23;




        while (n>1){

            n=n/2;
        }

        if(n<1.0){
            System.out.println(n);
            System.out.println("Not Power of  2 ");
        }
        else System.out.println("Power of 2");


    }
}
