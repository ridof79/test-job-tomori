package res;

import java.util.Scanner;

public class SegitigaSamaKaki {
    public static void printSegitiga() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan alas segitiga : ");
        int alas = input.nextInt();

        if (alas <= 0) {
            System.out.println("Input harus lebih besar dari nol.");
            printSegitiga();
        }

        for (int i = 1; i <= alas; i++) {
            for (int j = alas-1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
