package Popular;

// { Driver Code Starts
//Initial Template for Java

import java.io.IOException;
import java.util.Scanner;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = Solution.productExceptSelf(array, n);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            t--;
        }
    }
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    public static long[] productExceptSelf(int[] nums, int n) {


        long totalSum = 1;
        int zeroCount = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {

                zeroCount++;
            }

            totalSum *= nums[i];

        }

        long[] numss = new long[n];

        if (zeroCount >= 2) {


            return numss;


        }

        if (zeroCount == 1) {

            int zeroIndex = 0;
            long sum = 1;
            for (int i = 0; i < n; i++) {


                if (nums[i] == 0) {

                    zeroIndex = i;

                    continue;


                }

                sum *= nums[i];

            }


            for (int i = 0; i < n; i++) {

                if (i == zeroIndex) {

                    numss[i] = sum;
                    continue;
                }
                numss[i] = 0;
            }
            return numss;
        }


        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {
                numss[i] = totalSum;
                break;
            }

            numss[i] = totalSum / nums[i];
        }
        return numss;

    }
}
