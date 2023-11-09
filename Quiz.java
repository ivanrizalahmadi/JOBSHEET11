import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu = 'y';

        do {
            int numberToGuess = random.nextInt(10) + 1; // Menghasilkan angka acak antara 1-10
            boolean success = false;

            do {
                System.out.print("Tebak angka (1-10): ");
                int userGuess = input.nextInt();
                input.nextLine();

                if (userGuess == numberToGuess) {
                    success = true;
                    System.out.println("Tebakan Anda Benar!");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Angka terlalu kecil.");
                } else {
                    System.out.println("Angka terlalu besar.");
                }
            } while (!success);

            System.out.print("Apakah Anda ingin mengulangi permainan (Y/y)? ");
            menu = input.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');

        input.close(); // Menutup Scanner setelah selesai digunakan
    }
}
