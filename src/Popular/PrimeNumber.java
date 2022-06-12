package Popular;

public class PrimeNumber {




    private static boolean checkIfPrime(int n) {

        if (n==0 | n==1 || n==2) return false;

        for(int i =2;i<=Math.sqrt(n);i++){
            if((n%i)==0) return false;
        }

        return true;
    }


}
