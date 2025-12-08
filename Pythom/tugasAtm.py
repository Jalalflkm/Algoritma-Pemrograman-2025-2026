import sys # Digunakan untuk fungsi exit

# Data Awal (Poin 5)
NAMA_PENGGUNA = "JALAL"
SALDO_AWAL = 2510109
saldo_saat_ini = SALDO_AWAL
PIN_BENAR = "2417" # Anggap PIN 4 digit

# --- Fungsi untuk Input Nama dengan Validasi --- (Poin 1, 2, 3, 4)
def input_nama():
    while True:
        nama = input("Masukkan Nama Anda: ")
        
        # Poin 2: Pastikan namanya benar pakai TRUE (Nama hanya boleh huruf)
        if all(char.isalpha() or char.isspace() for char in nama) and nama.strip():
            print(f"Halo, **{nama.upper()}**! Selamat datang di layanan ATM.")
            # Poin 3: Jika nama FALSE (Tidak hanya huruf), minta untuk memasukkan nama kembali.
            # Ini ditangani oleh loop while True dan kondisi else di bawah.
            # Poin 4: Input harus minimal 5 karakter (Huruf Kapital Semua)
            if len(nama.strip()) >= 5:
                return nama.upper()
            else:
                print("Nama harus minimal 5 karakter. Silakan coba lagi.")
        else:
            print("Nama hanya boleh mengandung huruf dan spasi. Silakan coba lagi.")

# --- Fungsi untuk Cek PIN (simulasi login) ---
def cek_pin():
    percobaan = 3
    while percobaan > 0:
        pin = input("Masukkan PIN Anda: ")
        if pin == PIN_BENAR:
            print("PIN Benar. Akses diberikan.")
            return True
        else:
            percobaan -= 1
            print(f"PIN salah. Sisa percobaan: {percobaan}")
    print("PIN salah 3 kali. Akun terblokir.")
    sys.exit() # Keluar dari program

# --- Fungsi Utama Program ATM ---
def program_atm():
    global saldo_saat_ini
    
    # Proses Awal
    nama_user = input_nama()
    cek_pin()

    # Poin 6: Tampilkan Nama dan Saldo Awal
    print(f"\nNama: **{nama_user}**")
    print(f"Saldo Awal: Rp {SALDO_AWAL:,.0f}")
    
    # Poin 7: Tampilkan Menu ATM (Menggunakan Switch-Case, di Python menggunakan if/elif/else)
    while True:
        print("\n" + "="*20)
        print("MENU ATM **(Switch-Case)**")
        print("1. Cek Saldo")
        print("2. Tarik Tunai")
        print("3. Setor Tunai")
        print("4. Transfer")
        print("5. Keluar")
        print("="*20)
        
        pilihan = input("Pilih menu (1-5): ")
        
        if pilihan == '1':
            # 1. Cek Saldo
            print(f"\n💰 Saldo Anda saat ini adalah: **Rp {saldo_saat_ini:,.0f}**")
            
        elif pilihan == '2':
            # 2. Tarik Tunai
            try:
                jumlah_tarik = int(input("Masukkan jumlah Tarik Tunai: Rp "))
                if jumlah_tarik > 0:
                    if saldo_saat_ini >= jumlah_tarik:
                        saldo_saat_ini -= jumlah_tarik
                        print(f"✅ Penarikan berhasil: Rp {jumlah_tarik:,.0f}")
                        print(f"Sisa saldo: Rp {saldo_saat_ini:,.0f}")
                    else:
                        print("❌ Saldo tidak mencukupi!")
                else:
                    print("❌ Jumlah penarikan harus lebih dari nol.")
            except ValueError:
                print("❌ Input tidak valid. Masukkan angka.")
                
        elif pilihan == '3':
            # 3. Setor Tunai
            try:
                jumlah_setor = int(input("Masukkan jumlah Setor Tunai: Rp "))
                if jumlah_setor > 0:
                    saldo_saat_ini += jumlah_setor
                    print(f"✅ Setoran berhasil: Rp {jumlah_setor:,.0f}")
                    print(f"Saldo Anda sekarang: Rp {saldo_saat_ini:,.0f}")
                else:
                    print("❌ Jumlah setoran harus lebih dari nol.")
            except ValueError:
                print("❌ Input tidak valid. Masukkan angka.")

        elif pilihan == '4':
            # 4. Transfer
            print("⛔ Fitur Transfer **BELUM TERSEDIA**")

        elif pilihan == '5':
            # 5. Keluar
            # Poin 5: Nah, jadi saldo kamu Rp 2.310.355 (Saldo Awal)
            # Karena sudah ada transaksi, harusnya saldo akhir yang ditampilkan.
            print("\nTerima kasih telah menggunakan layanan ATM.")
            print(f"**Nama: {nama_user}**")
            print(f"**Saldo Akhir Anda: Rp {saldo_saat_ini:,.0f}**")
            break # Keluar dari loop while
            
        else:
            print("Pilihan tidak valid. Silakan pilih menu 1 sampai 5.")

# Jalankan program
if __name__ == "__main__":
    program_atm()