public class HitungLuasSegitigaFunction {
  public static void main (String [] args) {
    double a = 2.0 ;
    double t = 3.0 ;
    System.out.println("alas : "+a+" cm "+"tinggi : "+t+" cm") ;
    System.out.println("Luas Segitiga : alas x tinggi / 2") ;
    System.out.println("Luas Segitiga : "+luasSegitiga(a, t)+" cm^2") ;

  }
  static double luasSegitiga (double a, double t) {
    double L ;
    L = a*t/2 ;
    return L ;

  }
}
