import java.io.*;

public class VolumeBalok
{
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int p, l, t, v;
        
        System.out.println("=== Menghitung Volume Balok ===");
        
        System.out.print("Masukkan nilai p (panjang balok) : ");
        p = Integer.parseInt(input.readLine());
        
        System.out.print("Masukkan nilai l (lebar balok) : ");
        l = Integer.parseInt(input.readLine());
        
        System.out.print("Masukkan nilai t (tinggi balok) : ");
        t = Integer.parseInt(input.readLine());
        
        v = p * l * t;
        
        System.out.println("Volume Balok : " + v);
    }
}