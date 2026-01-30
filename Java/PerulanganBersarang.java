public class PerulanganBersarang{
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int row;
    int maks_row = 10;
    int star;
    for(row=1; row< maks_row; row++) {
      for(star=1; star<=row; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}