import java.util.Scanner;

public class dz8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;

        while (n != 0) {
            int digit = n % 10;
            i = i * 10 + digit;
            n /= 10;

        }

        System.out.println(i);
    }
}
