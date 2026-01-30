import java.io.*;

public class VolumeKubus 
{
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int s, v;
        
        System.out.println("=== Menghitung Volume Kubus ===");
        
        System.out.print("Masukkan nilai s (sisi kubus) : ");
        s = Integer.parseInt(input.readLine());
        
        v = s * s * s;
        
        System.out.println("Volume Kubus : " + v);
    }
}