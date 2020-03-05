package two;

import java.util.*;

/**Detailed problem statement can be found at:  https://www.hackerrank.com/contests/projecteuler/challenges/euler002/problem*/
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long[] numbers = new long[t];
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            numbers[a0]=calculate(n);
        }

        for(int i=0;i<numbers.length;i++)
            System.out.println(numbers[i]);
    }

    private static long calculate(long n) {
        long sum=0;
        List<Long> series=fibonacci(n);
        for(int i=0;i<series.size();i++)
            if(series.get(i)%2==0)
                sum+=series.get(i);
        return sum;
    }

    private static List<Long> fibonacci(long n) {
        long a=1, b=2;
        long c=a+b;
        List<Long> series=new ArrayList<>();
        series.add(a);
        series.add(b);
        while(c<n){
            series.add(c);
            a=b;
            b=c;
            c=a+b;
        }
        return series;
    }
}
