/*
 * Problem: Project Euler #1: Multiples of 3 and 5
 * Problem Description: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below N.

Input Format

First line contains T that denotes the number of test cases. This is followed by T lines, each containing an integer, N.

Constraints:
1 <= T <= 10^5
1 <= N <= 10^9

Output Format

For each test case, print an integer that denotes the sum of all the multiples of 3 or 5 below N.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            n--; // Adjust n to get the sum below n

            long sum = getSum(n, 3) + getSum(n, 5) - getSum(n, 15);

            System.out.println(sum);
        }

        bufferedReader.close();
    }

    private static long getSum(int target, int divisor) {
        int p = target / divisor;
        return divisor * (long) p * (p + 1) / 2;
    }
}
