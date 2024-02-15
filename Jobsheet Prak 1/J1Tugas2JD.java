import java.util.Scanner;

public class J1Tugas2JD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Hitung Kecepatan (v)");
            System.out.println("2. Hitung Jarak (s)");
            System.out.println("3. Hitung Waktu (t)");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");
            int menu = scanner.nextInt();

            if (menu == 4) {
                break;
            }

            double v, s, t;
            String satuanJarak, satuanWaktu;
            switch (menu) {
                case 1:
                    System.out.print("Masukkan jarak (s): ");
                    s = scanner.nextDouble();
                    satuanJarak = getSatuan("Masukkan satuan jarak (km/m): ", "km", "m");
                    System.out.print("Masukkan waktu (t): ");
                    t = scanner.nextDouble();
                    satuanWaktu = getSatuan("Masukkan satuan waktu (jam/menit): ", "jam", "menit");
                    v = hitungKecepatan(s, t);
                    System.out.println("Kecepatan (v) = " + v + " " + satuanJarak + "/" + satuanWaktu);
                    break;
                case 2:
                    System.out.print("Masukkan kecepatan (v): ");
                    v = scanner.nextDouble();
                    System.out.print("Masukkan waktu (t): ");
                    t = scanner.nextDouble();
                    satuanJarak = getSatuan("Masukkan satuan jarak (km/m): ", "km", "m");
                    s = hitungJarak(v, t);
                    System.out.println("Jarak (s) = " + s + " " + satuanJarak);
                    break;
                case 3:
                    System.out.print("Masukkan jarak (s): ");
                    s = scanner.nextDouble();
                    satuanJarak = getSatuan("Masukkan satuan jarak (km/m): ", "km", "m");
                    System.out.print("Masukkan kecepatan (v): ");
                    v = scanner.nextDouble();
                    satuanWaktu = getSatuan("Masukkan satuan waktu (jam/menit): ", "jam", "menit");
                    t = hitungWaktu(s, v);
                    System.out.println("Waktu (t) = " + t + " " + satuanWaktu);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }

    public static double hitungKecepatan(double s, double t) {
        return s / t;
    }

    public static double hitungJarak(double v, double t) {
        return v * t;
    }

    public static double hitungWaktu(double s, double v) {
        return s / v;
    }

    public static String getSatuan(String message, String satuan1, String satuan2) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        System.out.println("Pilih satuan (1=" + satuan1 + "/2=" + satuan2 + "): ");
        int pilihan = scanner.nextInt();
        return pilihan == 1 ? satuan1 : satuan2;
    }
}
