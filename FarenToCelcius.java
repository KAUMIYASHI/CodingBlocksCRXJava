import java.util.Scanner;

public class FarenToCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fmin = sc.nextInt();
        int fmax = sc.nextInt();
        int fstep = sc.nextInt();
        sc.close();
        int fcurrent = fmin;
        while (fcurrent <= fmax) {
            int c = (int) ((5.0 / 9) * (fcurrent - 32));
            System.out.println(fcurrent + " " + c);
            fcurrent += fstep;
        }
    }
}
