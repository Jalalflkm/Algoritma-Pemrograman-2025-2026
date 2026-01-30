import java.io.*;

public class VolumePrisma  
{
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        double LAlas,t,v;
        
        System.out.println("=== Menghitung Volume Prisma ===");
        
        System.out.print("Masukkan nilai LAlas (luas alas) : ");
        LAlas = Integer.parseInt(input.readLine());
        
        System.out.print("Masukkan nilai t (tinggi prisma) : ");
        t = Integer.parseInt(input.readLine());
        
        v = LAlas * t;
        
        System.out.println("Volume Prisma : " + v);
    }
}