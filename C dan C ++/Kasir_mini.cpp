#include <iostream>
#include <string>
using namespace std;

int main() {
    string nama;
    float harga;
    int jumlah;

    cout << "Masukkan nama barang: ";
    getline(cin, nama);

    cout << "Masukkan harga barang: ";
    cin >> harga;

    cout << "Masukkan jumlah beli: ";
    cin >> jumlah;

    float total = harga * jumlah;
    float diskon;

    if (total > 10900) {
        diskon = total * 0.09;   // sesuai contoh
    } else {
        diskon = 0;
    }

    float total_bayar = total - diskon;

    cout << "\n===== Struk Pembayaran =====\n";
    cout << "Nama Barang   : " << nama << endl;
    cout << "Harga Satuan  : " << harga << endl;
    cout << "Jumlah Beli   : " << jumlah << endl;
    cout << "Total Harga   : " << total << endl;
    cout << "Diskon        : " << diskon << endl;
    cout << "Total Bayar   : " << total_bayar << endl;
    cout << "============================\n";

    return 0;
}