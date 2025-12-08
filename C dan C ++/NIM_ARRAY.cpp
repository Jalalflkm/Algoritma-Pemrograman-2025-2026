#include <iostream>
#include <vector>
#include <string>
#include <numeric>
#include <algorithm>
#include <cmath>

using namespace std;

int main() {
    string nim;
    cout << "Masukkan NIM: ";
    getline(cin, nim); 
    vector<int> array_digit;
    for (char c : nim) {
        if (isdigit(c)) {
            array_digit.push_back(c - '0');
        }
    }
    if (array_digit.empty()) {
        cout << "NIM tidak valid atau tidak memiliki digit." << endl;
        return 0;
    }

    int total = accumulate(array_digit.begin(), array_digit.end(), 0);

    int maks = *max_element(array_digit.begin(), array_digit.end());

    int minim = *min_element(array_digit.begin(), array_digit.end());

    double rata = (double)total / array_digit.size();

    vector<int> rev = array_digit;
    reverse(rev.begin(), rev.end());

    cout << "\n--- Hasil Perhitungan ---" << endl;
    cout << "Digit                   : ";
    for (int d : array_digit) {
        cout << d << " ";
    }
    cout << endl;

    cout << "Total                   : " << total << endl;
    cout << "Maksimum                : " << maks << endl;
    cout << "Minimum                 : " << minim << endl;
    cout << fixed << "Rata-rata               : " << rata << endl; 
    cout << "Reverse array           : ";
    for (int d : rev) {
        cout << d << " ";
    }
    cout << endl;

    return 0;
}