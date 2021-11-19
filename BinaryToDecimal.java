import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        int decimal = 0;
        int i = 0;
        while (n != 0) {
            decimal += Math.pow(2, i) * (n % 10);
            n /= 10;
            i++;
        }
        System.out.println(decimal);
    }

}
