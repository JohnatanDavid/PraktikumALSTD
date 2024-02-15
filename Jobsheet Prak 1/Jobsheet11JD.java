import java.util.Scanner;

public class Jobsheet11JD {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.println("masukkan Nilai Tugas: ");
        int Tugas = sc.nextInt();

        System.out.println("Masukkan nilai Kuis: ");
        int Kuis = sc.nextInt();

        System.out.println("Masukkan nilai UTS: ");
        int UTS = sc.nextInt();

        System.out.println("Masukkan Nilai UAS: ");
        int UAS = sc.nextInt();

        System.out.println("==============================");
        System.out.println("==============================");

        if (benar(Tugas, Kuis, UTS, UAS)) {
            double nilaiAkhir = hitungNilaiAkhir(Tugas, Kuis, UTS, UAS);
            String nilaiHuruf = konversiNilai(nilaiAkhir);
            String status = nilaiHuruf.equals("D") || nilaiHuruf.equals("E") ? "TIDAK LULUS" : "LULUS";

            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: " + nilaiHuruf);
            System.out.println("==============================");
            System.out.println("SELAMAT ANDA " + status);
        } else {
            System.out.println("Nilai tidak valid.");
        }

    }
    
    public static boolean benar(int Tugas, int Kuis, int UTS, int UAS) {
        return  Tugas >= 0 && Tugas <= 100 &&
                Kuis >= 0 && Kuis <= 100 &&
                UTS >= 0 && UTS <= 100 &&
                UAS >= 0 && UAS <= 100;
    }

    public static double hitungNilaiAkhir(int Tugas, int Kuis, int UTS, int UAS) {
        return 0.2 * Tugas + 0.2 * Kuis + 0.3 * UTS + 0.4 * UAS;
    }

    public static String konversiNilai(double nilai) {
        if (nilai >= 80) {
            return "A";
        }else if (nilai >= 73) {
            return "B+";
        }else if (nilai >= 65) {
            return "B";
        }else if (nilai >= 60) {
            return "C+";
        }else if (nilai >= 50) {
            return "C";
        }else if (nilai >= 39) {
            return "D";
        }else {
            return "E";
        }
    }
}