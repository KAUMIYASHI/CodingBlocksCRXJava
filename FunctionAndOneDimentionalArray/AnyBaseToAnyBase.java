import java.util.Scanner;

/*
Convert the given number n in base b1 to number base b2
input:
n b1 b2;
output:
number in base b2;
*/

public class AnyBaseToAnyBase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        sc.close();
        int decimalNo = AnyBaseToDecimal.anyBaseToDecimal(n, b1);
        int ans = DecimalToAnyBase.decimalToAnyBase(decimalNo, b2);
        System.out.println(ans);

    }
}
