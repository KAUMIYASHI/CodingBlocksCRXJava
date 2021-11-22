
import java.util.Scanner;

/*
 * Convert the given number n in base 10 a number i.e base 10 input: n b;
 * output: number in base 10;
 */

public class DecimalToAnyBase {
    public static int decimalToAnyBase(int n, int b) {
        int ans = 0;
        int counter = 0;

        while (n > 0) {
            int rem = n % b;
            ans += rem * Math.pow(10, counter);
            n /= b;
            counter++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(decimalToAnyBase(n, b));

    }
}
