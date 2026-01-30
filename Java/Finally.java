import java.util.Scanner;
class Finally{
  public static void main(String[] args) {
    Scanner masukan = new Scanner(System.in);
    int angka;
    System.out.print("Masukkan Angka : ");
    try {
          angka = masukan.nextInt();
          System.out.println("Anda memasukkan Angka "+angka);
    }catch(Exception e) {
          System.out.println("Anda tidak memasukkan Angka");
    }finally {
          System.out.println("Program Selesai.");
    }
  }
}