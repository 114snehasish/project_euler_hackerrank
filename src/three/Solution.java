package three;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            System.out.println(largestPrimeFactorX(n));
            System.out.println(largestPrimeFactor(n));
        }
    }

    /**
     * Straight forward solution. This would not pass some of the test case due to execution time.
     * @param n the input number
     * @return the largest prime factor of <strong>n</strong>
     */
    private static long largestPrimeFactor(long n) {
        long largest = 2;
        if (isPrime(n))
            return n;
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (isPrime(i) && n % i == 0)
                    largest = i;
            }
        }
        return largest;
    }


    private static boolean isPrime(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    /**
     * Optimal solution which will satisfy all the test case. This is not a straight forward solution to
     * the problem.
     * @param n the input number
     * @return the largest prime factor of <strong>n</strong>
     */
    private static long largestPrimeFactorX(long n) {
        while (n % 2 == 0) {
            n = n / 2;
        }
        if (n == 1)
            return 2;
        else {
            long largestPrime = 3;
            int i = 3;
            while (i <= n / i) {
                if (n % i == 0) {
                    n = n / i;
                    largestPrime = i;
                } else
                    i += 2;
            }
            if (n > 2)
                return n;
            else
                return largestPrime;
        }
    }
}
