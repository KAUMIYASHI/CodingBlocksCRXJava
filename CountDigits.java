import java.util.Scanner;

public class CountDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        sc.close();
        int ans = Integer.toString(n).replaceAll(("[^" + x + "]"), "").length();
        // String s = Integer.toString(n).replaceAll(("[^" + x + "]"), "");
        System.out.println(ans);
    }
}
