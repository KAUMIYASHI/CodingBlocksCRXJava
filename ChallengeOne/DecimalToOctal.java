
/**Take N (number in decimal format). Write a function that converts it to octal format. Print the value returned.

Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
63
Sample Output
77
Explanation
Both input and output are integers */

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int octal[] = new int[8];
        for (int i = 1; i < 8; i++)
            octal[i] = i % 8;
        String s = "";
        while (n > 0) {
            int rem = n % 8;
            s = octal[rem] + s;
            n /= 8;
        }
        // for (int str : octal) {
        // System.out.println(str);
        // }
        System.out.println(s);
    }

}
