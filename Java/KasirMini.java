import java.util.Scanner;

public class KasirMini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String nama = input.nextLine();

        System.out.print("Masukkan harga barang: ");
        float harga = input.nextFloat();

        System.out.print("Masukkan jumlah beli: ");
        int jumlah = input.nextInt();

        float total = harga * jumlah;
        float diskon;

        if (total > 10900) {
            diskon = total * 0.9f;   // sesuai contoh
        } else {
            diskon = 0;
        }

        float total_bayar = total - diskon;

        System.out.println("\n===== Struk Pembayaran =====");
        System.out.println("Nama Barang   : " + nama);
        System.out.println("Harga Satuan  : " + harga);
        System.out.println("Jumlah Beli   : " + jumlah);
        System.out.println("Total Harga   : " + total);
        System.out.println("Diskon        : " + diskon);
        System.out.println("Total Bayar   : " + total_bayar);
        System.out.println("============================");
    }
}