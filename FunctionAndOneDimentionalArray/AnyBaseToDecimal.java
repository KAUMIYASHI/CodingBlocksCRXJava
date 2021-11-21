
/*
Convert the given number n in base b to decimal number i.e base 10
input:
n b;
output:
number in base 10;
*/
import java.util.Scanner;

public class AnyBaseToDecimal {

    public static int anyBaseToDecimal(int n, int b) {
        int ans = 0;
        int counter = 0;

        while (n > 0) {
            int rem = n % 10;
            ans += rem * Math.pow(b, counter);
            n /= 10;
            counter++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(anyBaseToDecimal(n, b));

    }
}
