/*
Help Manmohan to print pattern of a given number. See the output pattern for given input n = 5.

Input Format
Single integer N denoting number of lines of the pattern.

Constraints
N<=1000

Output Format
Pattern.

Sample Input
5
Sample Output
1
11
202
3003
40004
Explanation
If row number is n (>1), total character is n. First and last character is n-1 and rest are 0. */

import java.util.Scanner;

public class ManmohanLovesPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (i == 1)
                    System.out.print(i);
                else if (j == 0 || j == i - 1)
                    System.out.print(i - 1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }

}
