import java.util.Scanner;

public class dz7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int n = sc.nextInt(); n > 0; n /= 10) {

            if (n == 0) {
                continue;
            }
            sum += n % 10;

        }
        System.out.println(sum);
    }
}


