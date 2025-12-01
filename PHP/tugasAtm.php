<?php
// Data Awal
$nama_pengguna = "JALAL";
$saldo_awal = 2510109;
$saldo_saat_ini = $saldo_awal;

function tampilkan_menu($saldo_saat_ini) {
    echo "\n====================\n";
    echo "MENU ATM (Switch-Case)\n";
    echo "1. Cek Saldo\n";
    echo "2. Tarik Tunai\n";
    echo "3. Setor Tunai\n";
    echo "4. Transfer\n";
    echo "5. Keluar\n";
    echo "====================\n";

    // Menerima input dari pengguna (CLI)
    $pilihan = readline("Pilih menu (1-5): ");

    switch ($pilihan) {
        case '1':
            echo "\n💰 Saldo Anda saat ini adalah: Rp " . number_format($saldo_saat_ini, 0, ',', '.') . "\n";
            break;
        case '2':
            $jumlah_tarik = (int) readline("Masukkan jumlah Tarik Tunai: Rp ");
            if ($jumlah_tarik > 0 && $saldo_saat_ini >= $jumlah_tarik) {
                $saldo_saat_ini -= $jumlah_tarik;
                echo "✅ Penarikan berhasil: Rp " . number_format($jumlah_tarik, 0, ',', '.') . "\n";
                echo "Sisa saldo: Rp " . number_format($saldo_saat_ini, 0, ',', '.') . "\n";
            } else {
                echo "❌ Gagal Tarik Tunai. Saldo tidak mencukupi atau jumlah tidak valid.\n";
            }
            break;
        case '3':
            $jumlah_setor = (int) readline("Masukkan jumlah Setor Tunai: Rp ");
            if ($jumlah_setor > 0) {
                $saldo_saat_ini += $jumlah_setor;
                echo "✅ Setoran berhasil: Rp " . number_format($jumlah_setor, 0, ',', '.') . "\n";
                echo "Saldo Anda sekarang: Rp " . number_format($saldo_saat_ini, 0, ',', '.') . "\n";
            } else {
                echo "❌ Jumlah setoran harus lebih dari nol.\n";
            }
            break;
        case '4':
            echo "⛔ Fitur Transfer **BELUM TERSEDIA**\n";
            break;
        case '5':
            echo "\nTerima kasih, **{$nama_pengguna}**. Saldo Akhir Anda: Rp " . number_format($saldo_saat_ini, 0, ',', '.') . "\n";
            exit; // Keluar dari program
        default:
            echo "Pilihan tidak valid. Silakan pilih menu 1 sampai 5.\n";
    }
    return $saldo_saat_ini;
}

// Loop Utama Program
while (true) {
    $saldo_saat_ini = tampilkan_menu($saldo_saat_ini);
}
?>