import java.util.Scanner;

public class Jobsheet12JD {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan NIM : ");
        String NIM = sc.next();
        int n = Integer.parseInt(NIM.substring(NIM.length()-2));

        if (n < 10) {
            n += 10;
        }

        System.out.println("===================");
        System.out.println("n : " + n);
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i);
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}