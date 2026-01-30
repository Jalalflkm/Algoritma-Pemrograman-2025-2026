import java.util.Arrays;
public class multidimensional {
  public static void main(String[] args) {
    int[][] angkaGenap = { {2, 4, 6, 8}, {10, 12, 14, 16} };
    int x = angkaGenap[0][2];
    System.out.println(x);
    int y = angkaGenap[1][2];
    System.out.println(y);

    System.out.println();
    angkaGenap[1][3] = 18;
      System.out.println(Arrays.deepToString(angkaGenap));
  }
}