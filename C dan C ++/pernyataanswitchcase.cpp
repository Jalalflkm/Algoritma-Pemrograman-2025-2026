#include <stdio.h>
#include <conio.h>
#include <iostream>
using namespace std;

main()
{
    char kode;
    cout << "Masukkan Kode Barang [A..C] : ";
    cin >> kode;

    switch (kode)
    {
    case 'A':
        cout << "Alat Olah Raga";
        break;
    case 'B':
        cout << "Alat Elektronik";
        break;
    case 'C':
        cout << "Alat Masak";
        break;
    default:
        cout << "Anda Salah Memasukkan kode";
        break;
    }
    getch();
}