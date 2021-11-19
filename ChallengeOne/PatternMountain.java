
import java.util.Scanner;

/*
 Take N (number of rows), print the following pattern (for N = 4).

                       1           1
                       1 2       2 1  
                       1 2 3   3 2 1
                       1 2 3 4 3 2 1   
Input Format
Constraints
0 < N < 10

Output Format
Sample Input
4
Sample Output
1						1
1	2				2	1
1	2	3		3	2	1
1	2	3	4	3	2	1
 */

public class PatternMountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int nch = 1;

        int r = n;
        while (r >= 1) {
            int nsp = 2 * r - 3;
            int val = 1;
            for (int i = 0; i < nch; i++) {
                System.out.print(val + "\t");
                val++;
            }
            val--;
            for (int i = 0; i < nsp; i++) {
                System.out.print("\t");
            }
            if (r == 1)
                val--;

            for (int i = 0; i < nch; i++) {
                if (val > 0)
                    System.out.print(val + "\t");
                val--;
            }

            r--;
            nsp -= 2;
            nch++;
            System.out.println();
        }

    }
}
