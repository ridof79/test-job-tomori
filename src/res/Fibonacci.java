package res;

import java.util.Scanner;

public class Fibonacci {

    public static void printFibonacci() {
        int x = 1, y = 1, z = 1;
        System.out.print("Masukan jumlah bilangan fibonacci : ");
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();

        if (jumlah <= 0) {
            System.out.println("Input harus lebih besar dari nol.");
            printFibonacci();
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.print(z + " ");
            z = x + y;
            x = y;
            y = z;
        }
        System.out.println();
        input.nextLine();
    }

}
