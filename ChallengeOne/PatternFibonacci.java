
/*
Take N (number of rows), print the following pattern (for N = 4)
0
1 1
2 3 5
8 13 21 34

Input Format
Constraints
0 < N < 100

Output Format
Sample Input
4
Sample Output
0 
1    1 
2    3     5 
8   13    21    34
Explanation
Each number is separated from other by a tab. For given input n, You need to print n(n+1)/2 fibonacci numbers. Kth row contains , next k fibonacci numbers.
*/

import java.util.Scanner;

public class PatternFibonacci {

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n < 3)
            return 1;
        else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(fibonacci(count) + "\t");
                count++;
            }
            System.out.println();
        }
    }

}
