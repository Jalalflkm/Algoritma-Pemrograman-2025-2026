public class FungsiStatic {
  static void minum(String minuman){ 
    System.out.println("Saya suka minum " + minuman);
  }
  
  void makan(String makanan){
    System.out.println("Saya suka makan " + makanan);
  }
  
  public static void main(String[] args) {
    minum ("Kopi") ;
    FungsiStatic saya = new FungsiStatic();
    saya.makan ("Pisang Goreng") ;
  }
}