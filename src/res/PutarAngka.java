package res;

import java.util.Scanner;

public class PutarAngka {

    public static void angkaBolakbalik() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int number = input.nextInt();

        System.out.print("Masukkan jumlah iterasi : ");
        int totalIteration = input.nextInt();

        if (totalIteration <= 0 || number <= 0) {
            System.out.println("Kedua input harus lebih besar dari nol.");
            angkaBolakbalik();
        }

        for (int i = 1; i <= totalIteration; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(j);
                if (j == number) {
                    System.out.println(" ");
                    for (int k = 1; k <= 1; k++) {
                        for (int l = number; l >= 1; l--) {
                            System.out.print(l);
                            if (l == 1) {
                                System.out.println(" ");
                            }
                        }
                    }
                }
            }
        }
    }
}
