import javax.swing.*;
public class ContohOptionPane {
    public static void main(String[] args) {
        JFrame kotak;
        kotak = new JFrame();
        String nama = JOptionPane.showInputDialog(kotak, "Masukkan nama Anda: ");
        JOptionPane.showMessageDialog(kotak, "Selamat Datang, " + nama);
    }
}