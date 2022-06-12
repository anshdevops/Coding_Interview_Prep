package Popular;

public class SwapTwoStringsWIthoutThirdVar {

    public static void main(String[] args) {

        String i="Anshul";
        String j="Dhrvi";


        System.out.println("Before Swapping "+i+" "+j);
        i = i+j;
        j = i. substring(0,i.length()-j.length());
        i = i.substring(j.length());

        System.out.println("After Swapping");

        System.out.println(i +" "+j);




    }
}
