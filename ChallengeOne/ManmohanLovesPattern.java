/*
Given N, help Manmohan to print pattern upto N lines. For eg For N=6 , following pattern will be printed.

1
11
111
1001
11111
100001

Input Format
Single number N.

Constraints
N<=1000

Output Format
Pattern corresponding to N.

Sample Input
6
Sample Output
1 
11
111 
1001 
11111
100001
Explanation
For every odd number row print 1, odd number of times and for every even number row , print first and last character as 1 and rest of middle characters as 0. */

import java.util.Scanner;

public class ManmohanLovesPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                for (int j = 0; j < i; j++)
                    System.out.print(1);
            else
                for (int j = 0; j < i; j++) {
                    if (j == 0 || j == i - 1)
                        System.out.print(1);
                    else
                        System.out.print(0);
                }
            System.out.println();
        }
    }

}
