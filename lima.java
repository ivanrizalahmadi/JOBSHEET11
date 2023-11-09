import java.util.Scanner;

public class lima {
    public static void main(String[] args) {
        Scanner k1 = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = k1.nextInt();

        if (N < 3) {
            System.out.println("Nilai N minimal harus 3.");
            return;
        }

        for (int i = 1; i <= N; i++) {
            // Mencetak spasi untuk menyesuaikan posisi angka
            for (int k = N - i; k > 0; k--) {
                System.out.print(" ");
            }

            // Mencetak angka dari pojok kanan
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
