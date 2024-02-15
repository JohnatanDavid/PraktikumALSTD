import java.util.Scanner;

public class J1Tugas1JD {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[][] KOTA = {
            {"B", "A", "N", "T", "E", "N"},
            {"J", "A", "K", "A", "R", "T", "A"},
            {"B", "A", "N", "D", "U", "N", "G"},
            {"C", "I", "R", "E", "B", "O", "N"},
            {"B", "O", "G", "O", "R"},
            {"P", "E", "K", "A", "L", "O", "N", "G", "A", "N"},
            {"S", "E", "M", "A", "R", "A", "N", "G"},
            {"S", "U", "R", "A", "B", "A", "Y", "A"},
            {"M", "A", "L", "A", "N", "G"},
            {"T", "E", "G", "A", "L"}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMohon masukkan kode Plat dengan menggunaan HURUF BESAR karena harus memenuhi standar yang ditetapkan pemerintah");
        System.out.println("==================================================");
        System.out.print("Masukkan kode plat nomor (A/B/D/E/F/G/H/L/N/T): \n");
        char kodePlat = scanner.next().charAt(0);

        int indeks = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodePlat) {
                indeks = i;
                break;
            }
        }

        if (indeks != -1) {
            System.out.println("Plat nomer dengan kode " + kodePlat + " merupakan Kota : " + arrayToString(KOTA[indeks]));
        } else {
            System.out.println("Kode plat nomor tidak valid.");
        }

        scanner.close();
    }

    public static String arrayToString(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }
        return sb.toString();
    }
}
