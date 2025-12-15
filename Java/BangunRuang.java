public class BangunRuang {
    public static void main(String[] args) {
      int sisi = 15;
      int L = luasKubus(sisi);
      System.out.println(L);
    }
    
    static int luasPersegi(int sisi){
      return sisi * sisi;
    }
    
    static int luasKubus(int sisi){
      return 6 * luasPersegi (sisi) ;

    }
} 
