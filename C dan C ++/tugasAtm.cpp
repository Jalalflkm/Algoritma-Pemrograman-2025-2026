#include <iostream>
#include <limits> // Untuk membersihkan buffer input

using namespace std;

// Data Awal
const string NAMA_PENGGUNA = "JALAL";
const int SALDO_AWAL = 2510109;
int saldo_saat_ini = SALDO_AWAL;

void tampilkan_saldo(int saldo) {
    // Implementasi sederhana tanpa format ribuan, untuk fokus pada logika C++
    cout << "\n💰 Saldo Anda saat ini adalah: **Rp " << saldo << "**" << endl;
}

void tarik_tunai() {
    int jumlah_tarik;
    cout << "Masukkan jumlah Tarik Tunai: Rp ";
    
    // Memastikan input adalah angka
    if (!(cin >> jumlah_tarik)) {
        cout << "❌ Input tidak valid. Masukkan angka." << endl;
        cin.clear(); // Hapus flag error
        cin.ignore(numeric_limits<streamsize>::max(), '\n'); // Bersihkan buffer
        return;
    }

    if (jumlah_tarik > 0 && saldo_saat_ini >= jumlah_tarik) {
        saldo_saat_ini -= jumlah_tarik;
        cout << "✅ Penarikan berhasil: Rp " << jumlah_tarik << endl;
        cout << "Sisa saldo: Rp " << saldo_saat_ini << endl;
    } else {
        cout << "❌ Gagal Tarik Tunai. Saldo tidak mencukupi atau jumlah tidak valid." << endl;
    }
}

void setor_tunai() {
    int jumlah_setor;
    cout << "Masukkan jumlah Setor Tunai: Rp ";
    
    if (!(cin >> jumlah_setor)) {
        cout << "❌ Input tidak valid. Masukkan angka." << endl;
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
        return;
    }
    
    if (jumlah_setor > 0) {
        saldo_saat_ini += jumlah_setor;
        cout << "✅ Setoran berhasil: Rp " << jumlah_setor << endl;
        cout << "Saldo Anda sekarang: Rp " << saldo_saat_ini << endl;
    } else {
        cout << "❌ Jumlah setoran harus lebih dari nol." << endl;
    }
}

int main() {
    int pilihan;

    // Simulasi Poin 6
    cout << "Nama: **" << NAMA_PENGGUNA << "**" << endl;
    cout << "Saldo Awal: Rp " << SALDO_AWAL << endl;

    // Poin 7: Loop Menu Utama
    do {
        cout << "\n====================" << endl;
        cout << "MENU ATM (Switch-Case)" << endl;
        cout << "1. Cek Saldo" << endl;
        cout << "2. Tarik Tunai" << endl;
        cout << "3. Setor Tunai" << endl;
        cout << "4. Transfer" << endl;
        cout << "5. Keluar" << endl;
        cout << "====================" << endl;
        cout << "Pilih menu (1-5): ";

        // Validasi dan Input Pilihan
        if (!(cin >> pilihan)) {
            cout << "❌ Input menu tidak valid. Silakan masukkan angka." << endl;
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n'); // Membersihkan buffer
            pilihan = 0; // Menjaga loop tetap berjalan
            continue;
        }

        switch (pilihan) {
            case 1:
                tampilkan_saldo(saldo_saat_ini);
                break;
            case 2:
                tarik_tunai();
                break;
            case 3:
                setor_tunai();
                break;
            case 4:
                cout << "⛔ Fitur Transfer **BELUM TERSEDIA**" << endl;
                break;
            case 5:
                cout << "\nTerima kasih telah menggunakan layanan ATM." << endl;
                cout << "**Nama: " << NAMA_PENGGUNA << "**" << endl;
                cout << "**Saldo Akhir Anda: Rp " << saldo_saat_ini << "**" << endl;
                break;
            default:
                cout << "Pilihan tidak valid. Silakan pilih menu 1 sampai 5." << endl;
        }
    } while (pilihan != 5);

    return 0;
}