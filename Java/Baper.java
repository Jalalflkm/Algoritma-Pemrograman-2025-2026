import java . io . *;
public class Baper {
    public static void main ( String args [] ) throws Exception {
        InputStreamReader r= new InputStreamReader ( System . in ) ;
        BufferedReader br = new BufferedReader ( r ) ;
        System . out . print ( "Masukkan nama Anda: " ) ;
        String nama = br . readLine () ;
        System . out . println ( "Selamat Datang, " + nama ) ;
    }
}