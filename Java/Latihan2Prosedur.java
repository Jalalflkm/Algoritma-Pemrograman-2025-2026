public class Latihan2Prosedur
{
    public static void main(String[] args) {
        MetodePoin(255.7);
    }

    public static void MetodePoin(double poin) {
        if (poin > 202.5) {
            System.out.println("--Poin Yang Keluar--");
            System.out.println("Poin : Pertama");
        } else if (poin >= 122.4) {
            System.out.println("Poin : Kedua");
        } else {
            System.out.println("Poin : Ketiga");
        }
    }
}