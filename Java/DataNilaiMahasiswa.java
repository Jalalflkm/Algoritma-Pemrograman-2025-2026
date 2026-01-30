import javax.swing.*;

public class DataNilaiMahasiswa {
    public static void main(String[] args) throws Exception {
        double uts=0, uas=0, tugas=0, nilaiUTS, nilaiUAS, nilaiTugas, nilaiTotal;
        String nama = JOptionPane.showInputDialog("Input Nama ");
        String nim = JOptionPane.showInputDialog("Input NIM ");
        String matkul = JOptionPane.showInputDialog("Input Matkul ");
        
        uts = Double.parseDouble(JOptionPane.showInputDialog("Input Nilai UTS "));
        uas = Double.parseDouble(JOptionPane.showInputDialog("Input Nilai UAS "));
        tugas = Double.parseDouble(JOptionPane.showInputDialog("Input Nilai Tugas "));
        
        nilaiUTS = uts * 0.35;
        nilaiUAS = uas * 0.4;
        nilaiTugas = tugas * 0.25;
        nilaiTotal = nilaiUTS + nilaiUAS + nilaiTugas;
        
        JOptionPane.showMessageDialog(null, "DATA NILAI MAHASISWA \n Nama : " + nama +
        "\n Nim : " + nim +
        "\n Mata Kuliah : " + matkul +
        "\n Nilai UTS : " + nilaiUTS +
        "\n Nilai UAS : " + nilaiUAS +
        "\n Nilai Tugas : " + nilaiTugas +
        "\n Nilai Total : " + nilaiTotal);
    }
}