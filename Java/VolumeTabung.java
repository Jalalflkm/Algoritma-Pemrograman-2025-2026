import java.io.*;

public class VolumeTabung 
{
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        double r,t,v;
        
        System.out.println("=== Menghitung Volume Tabung ===");
        
        System.out.print("Masukkan nilai r (jari-jari) : ");
        r = Integer.parseInt(input.readLine());
        
        System.out.print("Masukkan nilai t (tinggi) : ");
        t = Integer.parseInt(input.readLine());
        
        v = Math.PI * r * r * t;
        
        System.out.println("Volume Tabung : " + v);
    }
}