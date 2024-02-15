import java.util.Scanner;

public class Jobsheet13JD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=========================");

        String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        int[] bobotSKS = {2, 3, 3, 3, 2, 3, 2, 2};
        String[] nilaiHuruf = new String[8];
        double[] nilaiSetara = new double[8];

        double totalNilaiSetara = 0;
        int totalSKS = 0;

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            double nilaiAngka = sc.nextDouble();
            nilaiSetara[i] = konversiNilaiAngkaKeSetara(nilaiAngka);
            nilaiHuruf[i] = konversiNilaiAngkaKeHuruf(nilaiAngka);
            totalNilaiSetara += nilaiSetara[i] * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }

        System.out.println("=========================");
        System.out.println("hasil konversi Nilai");
        System.out.println("=========================");
        System.out.printf("%-50s %-20s %-10s%n", "MK", "Nilai Huruf", "Nilai Angka");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-50s %-20s %-10.2f%n", mataKuliah[i], nilaiHuruf[i], nilaiSetara[i]);
        }

        double ip = totalNilaiSetara / totalSKS;
        System.out.println("=========================");
        System.out.println("IP : " + String.format("%.2f", ip));
    }

    public static double konversiNilaiAngkaKeSetara(double nilaiAngka) {
        if (nilaiAngka > 80) {
            return 4.0;
        } else if (nilaiAngka > 73) {
            return 3.5;
        } else if (nilaiAngka > 65) {
            return 3.0;
        } else if (nilaiAngka > 60) {
            return 2.5;
        } else if (nilaiAngka > 50) {
            return 2.0;
        } else if (nilaiAngka > 39) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public static String konversiNilaiAngkaKeHuruf(double nilaiAngka) {
        if (nilaiAngka > 80) {
            return "A";
        } else if (nilaiAngka > 73) {
            return "B+";
        } else if (nilaiAngka > 65) {
            return "B";
        } else if (nilaiAngka > 60) {
            return "C+";
        } else if (nilaiAngka > 50) {
            return "C";
        } else if (nilaiAngka > 39) {
            return "D";
        } else {
            return "E";
        }
    }
}
