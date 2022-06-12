package Popular;

public class SortZerosOnesTwos {
    public static void main(String[] args) {
        int arr[]={1,0,2,1,1,1,2,0};

        sort012(arr,arr.length);

        for (int i :arr) System.out.println(i);

    }


    public static void sort012(int a[], int n)
    {


        int zero=0, one=0,two=0;
        int count=0;

        for(int i=0;i<n;i++){


            if(a[i]==0) zero++;
            else if(a[i]==1) one++;
            else two++;



        }

        System.out.println("Zeros are "+zero);
        System.out.println("Ones are "+one);

        System.out.println("Twos are "+two);



        for(int i=0;i<zero;i++){

            a[count]=0;
            count++;


        }
        for(int i=0;i<one;i++){

            a[count]=1;
            count++;


        }
        for(int i=0;i<two;i++){

            a[count]=2;

            count++;

        }


    }
}
