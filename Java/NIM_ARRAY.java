public class NIM_ARRAY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Pemrosesan Digit NIM ===");
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        input.close();

        if (nim.isEmpty()) {
            System.err.println("Error: NIM tidak boleh kosong.");
            return;
        }

        int nimLength = nim.length();
        int[] digit = new int[nimLength];
        
        try {
            for (int i = 0; i < nimLength; i++) {
                char c = nim.charAt(i);
                if (Character.isDigit(c)) {
                    digit[i] = c - '0';
                } else {
                    throw new InputMismatchException("NIM hanya boleh mengandung digit (0-9).");
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Error: " + e.getMessage());
            return;
        }
        
        int total = 0;
        int max = digit[0];
        int min = digit[0];

        for (int d : digit) {
            total += d;
            if (d > max) max = d;
            if (d < min) min = d;
        }

        double rata = (double) total / nimLength;

        System.out.println("\n--- Hasil Perhitungan ---");
        
        System.out.print("Array digit: ");
        for (int d : digit) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Total digit      : " + total);
        System.out.println("Nilai maksimum   : " + max);
        System.out.println("Nilai minimum    : " + min);
        System.out.println("Rata-rata digit  : " + String.format("%.2f", rata)); 
        System.out.print("Reverse array      : ");
        for (int i = nimLength - 1; i >= 0; i--) {
            System.out.print(digit[i] + " ");
        }
        System.out.println();
    }
}
