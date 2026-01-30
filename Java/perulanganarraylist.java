import java.util.ArrayList;

public class perulanganarraylist {
  public static void main(String[] args) {
    ArrayList<String> akuSuka = new ArrayList<String>();
    akuSuka.add("Aku");
    akuSuka.add("Suka");
    akuSuka.add("Ngoding");

    for (int i = 0; i < akuSuka.size(); i++) {
      System.out.println(akuSuka.get(i));
    }
  }
}