import java.io.*;

public class DataInputStream {
    public static void main(String[] args) throws Exception {
        
        DataInputStream d = new DataInputStream(System.in);
        
        System.out.println("Silahkan masukkan nama kamu");
        
        String nama = d.readLine();
        
        System.out.println("Nama kamu = " + nama);
    }
}