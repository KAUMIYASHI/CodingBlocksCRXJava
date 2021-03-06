
/*
Take N (number of rows), print the following pattern (for N = 5)
1
2 2
3 0 3
4 0 0 4
5 0 0 0 5

Input Format
There will be an integer in input.

Constraints
0 < N < 100

Output Format
Print the pattern.

Sample Input
5
Sample Output
1  
2	2  
3	0	3    
4	0	0	4  
5	0	0	0	5
Explanation
Each number is separated from other by a tab.If row number is n (>1), total character is n. First and last character is n and rest are 0. */
import java.util.Scanner;

public class PatternWithZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((j == 0 || j == i) && i > 0)
                    System.out.print(i + 1 + "\t");
                else {
                    if (i != 0)
                        System.out.print(0 + "\t");
                    else
                        System.out.print(1 + "\t");
                }
            }
            System.out.println();
        }
    }

}
