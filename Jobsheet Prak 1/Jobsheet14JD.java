import java.util.Scanner;

public class Jobsheet14JD {
    static int[][] stockBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
    };

    static int[] hargaBunga = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {
        System.out.println("Pendapatan Setiap Cabang Jika Semua Bunga Terjual:");
        hitungPendapatanCabang();

        System.out.println("\nJumlah Stock Bunga di RoyalGarden 4 Setelah Bunga Mati:");
        hitungStockBunga(3, 1, 2, 0, 5); 
    }

    public static void hitungPendapatanCabang() {
        for (int i = 0; i < stockBunga.length; i++) {
            int totalPendapatan = 0;
            System.out.println("+------------------------------------------------+");
            System.out.println("|                 RoyalGarden " + (i + 1) + "                 |");
            System.out.println("+-----------+--------------+--------------+------------+");
            System.out.println("|   Bunga   |  Banyak Stok | Harga per pcs| Pendapatan |");
            System.out.println("+-----------+--------------+--------------+------------+");
            for (int j = 0; j < stockBunga[i].length; j++) {
                int pendapatanPerJenis = stockBunga[i][j] * hargaBunga[j];
                totalPendapatan += pendapatanPerJenis;
                System.out.printf("|%10s |%13d |%13d |%11d |\n", namaBunga(j), stockBunga[i][j], hargaBunga[j], pendapatanPerJenis);
            }
            System.out.println("+-----------+--------------+--------------+------------+");
            System.out.printf("| Total Pendapatan                          |%11d |\n", totalPendapatan);
            System.out.println("+-------------------------------------------+------------+");
        }
    }

    public static void hitungStockBunga(int indexCabang, int penguranganAglonema, int penguranganKeladi, int penguranganAlocasia, int penguranganMawar) {
        int totalStockAglonema = stockBunga[indexCabang][0] - penguranganAglonema;
        int totalStockKeladi = stockBunga[indexCabang][1] - penguranganKeladi;
        int totalStockAlocasia = stockBunga[indexCabang][2] - penguranganAlocasia;
        int totalStockMawar = stockBunga[indexCabang][3] - penguranganMawar;

        System.out.println("Aglonema: " + totalStockAglonema);
        System.out.println("Keladi: " + totalStockKeladi);
        System.out.println("Alocasia: " + totalStockAlocasia);
        System.out.println("Mawar: " + totalStockMawar);
    }

    public static String namaBunga(int index) {
        switch (index) {
            case 0:
                return "Aglonema";
            case 1:
                return "Keladi";
            case 2:
                return "Alocasia";
            case 3:
                return "Mawar";
            default:
                return "";
        }
    }
}
