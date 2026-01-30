public class Dowhileloop {
    public static void main(String[] args) {
        System.out.println("Awal Program");
        int a = 0;
        boolean kondisi = true;

        do {
            a++;
            System.out.println("Do While ke - " + a);

            if (a == 10) {
                kondisi = false;
            }
        } while (kondisi);

        System.out.println("Akhir Program");
    }
}