<?php

$nama = readline("Masukkan nama barang: ");
$harga = (float)readline("Masukkan harga barang: ");
$jumlah = (int)readline("Masukkan jumlah beli: ");

$total = $harga * $jumlah;

if ($total > 10900) {
    $diskon = $total * 0.09;   // sesuai contoh
} else {
    $diskon = 0;
}

$total_bayar = $total - $diskon;

echo "\n===== Struk Pembelian =====\n";
echo "Nama Barang   : $nama\n";
echo "Harga Satuan  : $harga\n";
echo "Jumlah Beli   : $jumlah\n";
echo "Total Harga   : $total\n";
echo "Diskon        : $diskon\n";
echo "Total Bayar   : $total_bayar\n";
echo "============================\n";
?>