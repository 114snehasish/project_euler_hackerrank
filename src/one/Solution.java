package one;

import java.util.Scanner;

/**
 *
 * Problem statement can be found at:   https://www.hackerrank.com/contests/projecteuler/challenges/euler001/problem*/

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long[] results=new long[t];
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();

            long upper3=(n-1)/3;
            long upper5=(n-1)/5;
            long upper15=(n-1)/15;

            long sum3=3*upper3*(upper3+1)/2;
            long sum5=5*upper5*(upper5+1)/2;
            long sum15=15*upper15*(upper15+1)/2;

            results[a0]=sum3+sum5-sum15;
        }

        for(int i=0;i<t;i++)
            System.out.println(results[i]);
    }
}
