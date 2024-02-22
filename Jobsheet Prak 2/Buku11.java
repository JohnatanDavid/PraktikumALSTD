import java.util.Scanner;

public class Buku11{
    String judul, pengarang;
    int halaman, stok, harga;
    int totalHarga, hargaDiskon;

    public Buku11() {

    }

    public Buku11(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        } else {
            System.out.println("Mohon Maaf, Stok Buku Telah Habis.");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int jumlahTerjual) {
        return harga * jumlahTerjual;
    }

    int hitungDiskon(int hargaTotal) {
        int diskon = 0;
        if (hargaTotal > 150000) {
            diskon = (int) (0.12 * hargaTotal);
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = (int) (0.05 * hargaTotal);
        }
        return diskon;
    }

    int hitungHargaBayar(int hargaTotal, int diskon) {
        return hargaTotal - diskon;
    }
}