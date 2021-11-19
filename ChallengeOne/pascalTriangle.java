package ChallengeOne;

/**Take N (number of rows), print the following pattern (for N = 6)
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1

Input Format
Constraints
0 < N < 100

Output Format
Sample Input
6
Sample Output
1  
1	1  
1	2	1  
1	3	3	1  
1	4	6	4	1  
1	5	10	10	5	1
Explanation
Each number is separated from other by a tab. */
import java.util.Scanner;

public class pascalTriangle {

    static int fact(int x) {
        if (x <= 1) {
            return 1;
        }
        return x * fact(x - 1);
    }

    static int combination(int n, int k) {
        int nfact = fact(n);
        int kfact = fact(k);
        int n_kfact = fact(n - k);
        // System.out.println((nfact / (kfact * n_kfact)) + " " + n + " " + k);
        return nfact / (kfact * n_kfact);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(combination(i, j));
                combination(i, j);
            }
            System.out.println();
        }
    }

}
