import java.util.Scanner;

public class tugasAtm {
    
    // Data Awal
    private static final String NAMA_PENGGUNA = "Jalal";
    private static final int SALDO_AWAL = 2510109;
    private static int saldoSaatIni = SALDO_AWAL;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        // Simulasi Poin 6: Tampilkan Nama dan Saldo Awal
        System.out.println("Nama: " + NAMA_PENGGUNA + "");
        System.out.println("Saldo Awal: Rp " + String.format("%,d", SALDO_AWAL));

        // Poin 7: Loop Menu Utama
        do {
            System.out.println("\n====================");
            System.out.println("MENU ATM (Switch-Case)");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Transfer");
            System.out.println("5. Keluar");
            System.out.println("====================");
            System.out.print("Pilih menu (1-5): ");

            // Validasi Input
            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                
                switch (pilihan) {
                    case 1:
                        System.out.println("\n💰 Saldo Anda saat ini adalah: **Rp " + String.format("%,d", saldoSaatIni) + "**");
                        break;
                    case 2:
                        System.out.print("Masukkan jumlah Tarik Tunai: Rp ");
                        if (scanner.hasNextInt()) {
                            int jumlahTarik = scanner.nextInt();
                            if (jumlahTarik > 0 && saldoSaatIni >= jumlahTarik) {
                                saldoSaatIni -= jumlahTarik;
                                System.out.println("✅ Penarikan berhasil: Rp " + String.format("%,d", jumlahTarik));
                                System.out.println("Sisa saldo: Rp " + String.format("%,d", saldoSaatIni));
                            } else {
                                System.out.println("❌ Gagal Tarik Tunai. Saldo tidak mencukupi atau jumlah tidak valid.");
                            }
                        } else {
                            System.out.println("❌ Input tidak valid.");
                            scanner.next(); // Membersihkan input
                        }
                        break;
                    case 3:
                        System.out.print("Masukkan jumlah Setor Tunai: Rp ");
                        if (scanner.hasNextInt()) {
                            int jumlahSetor = scanner.nextInt();
                            if (jumlahSetor > 0) {
                                saldoSaatIni += jumlahSetor;
                                System.out.println("✅ Setoran berhasil: Rp " + String.format("%,d", jumlahSetor));
                                System.out.println("Saldo Anda sekarang: Rp " + String.format("%,d", saldoSaatIni));
                            } else {
                                System.out.println("❌ Jumlah setoran harus lebih dari nol.");
                            }
                        } else {
                            System.out.println("❌ Input tidak valid.");
                            scanner.next(); // Membersihkan input
                        }
                        break;
                    case 4:
                        System.out.println("⛔ Fitur Transfer **BELUM TERSEDIA**");
                        break;
                    case 5:
                        System.out.println("\nTerima kasih telah menggunakan layanan ATM.");
                        System.out.println("**Nama: " + NAMA_PENGGUNA + "**");
                        System.out.println("**Saldo Akhir Anda: Rp " + String.format("%,d", saldoSaatIni) + "**");
                        break; // Keluar dari switch
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih menu 1 sampai 5.");
                }
            } else {
                System.out.println("❌ Input menu tidak valid. Silakan masukkan angka.");
                scanner.next(); // Membersihkan input
                pilihan = 0; // Menjaga loop tetap berjalan
            }

        } while (pilihan != 5);

        scanner.close();
    }
}