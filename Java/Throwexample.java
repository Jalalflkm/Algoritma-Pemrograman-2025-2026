public class Throwexample {
  static void checkUmur(int umur) {
    if (umur < 18) {
      throw new ArithmeticException("Akses ditolak - Anda harus berusia minimal 18 tahun.");
    } else {
      System.out.println("Akses diberikan - Anda sudah cukup umur!");
    }
  }
  public static void main(String[] args) {
    checkUmur(17);
  }
}