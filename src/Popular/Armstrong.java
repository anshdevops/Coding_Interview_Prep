package Popular;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter Number");

        int num=1634;
        int temp=num;

        double num2=num;
        int power=String.valueOf(num).length();

        while (temp>0){

            int x=temp/10;
            num2=num2+Math.pow(x,power);

        }

    }
}
