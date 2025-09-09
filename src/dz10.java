import java.util.Scanner;

public class dz10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vvedite chisli");
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        int c = 0;
        for (int i = 1; i <= n; i++) {
            c = a + d * i;
            System.out.print(" " + c);

        }
    }
}

