import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<Integer>();

        angka.add(11);
        angka.add(12);
        angka.add(13);

        for (int a : angka) {
            System.out.println(a);
        }
    }
}