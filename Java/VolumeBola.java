import java.io.*;

public class VolumeBola 
{
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        double r, v;
        
        System.out.println("=== Menghitung Volume Bola ===");
        
        System.out.print("Masukkan nilai r (jari-jari) : ");
        r = Integer.parseInt(input.readLine());
        
        v = 4.0 / 3.0 * Math.PI * r * r * r;
        
        System.out.println("Volume Bola : " + v);
    }
}