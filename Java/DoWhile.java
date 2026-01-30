import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float floatAngka = 0.0f;
        boolean validFloatAngka = false;

        do {
            System.out.print("Masukkan angka yang kamu sukai : ");
            String angka = scanner.nextLine();

            try {
                floatAngka = Float.parseFloat(angka);
                validFloatAngka = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Hola, Kamu tidak memasukkan angka float yang benar");
            }

        } while (validFloatAngka == false);

        System.out.println("Angka favoritmu : " + floatAngka);

        scanner.close();
    }
}
