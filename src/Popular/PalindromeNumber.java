package Popular;

public class PalindromeNumber {

    //  check 91233219

    public static void main(String[] args) {


        int x=91233219;


        int y=x%10;
        int temp_x=91233219/10;



        while(temp_x>0){


            int temp1=temp_x%10;
            y=(y*10)+temp1;
            temp_x=temp_x/10;

        }


        System.out.println(y);
        if(x==y){
            System.out.println("Palindrome");
        }


    }
}
