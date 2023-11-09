import java.util.Scanner;

public class penempatan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("Nilai N minimal harus 3.");
            return;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i > 1 && i < N && j > 1 && j < N) {

                    System.out.print("  ");
                } else {

                    System.out.print(N + " ");
                }
            }
            System.out.println();
        }
    }
}