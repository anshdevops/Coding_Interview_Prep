package Popular;

public class Fibonacci {
    public static void main(String[] args) {


        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);

        for(int i=0;i<=8;i++){

            int c=a+b;
            System.out.println(c);
            int tempB=b;
            b=c;
            a=tempB;


        }
    }
}
