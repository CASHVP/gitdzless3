import javax.crypto.spec.PSource;
import java.util.Scanner;

public class dz6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n число : ");
        int n = sc.nextInt(); // n=степень

        for (long x = 1; x <= n; x *= 2) {
            System.out.println(x);

        }


    }


}