import java . util . Scanner ;
public class Masukan {
    public static void main ( String [] args ) {
        @SuppressWarnings ( "resource" )
        Scanner masukan = new Scanner ( System . in ) ;
        String nama ;

        System . out . printlm ( "Masukkan nama Anda: " ) ;
        nama = masukan . nextLine () ;

        System . out . println ( "Selamat Datang, " + nama );
    }
}