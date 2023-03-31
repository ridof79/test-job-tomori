package res;

import java.util.Scanner;

public class Menu {
    public static void run() {
        Scanner input = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("JOB Tomori Logic Test");
        System.out.println("=========================================");
        System.out.println("Choose test :");
        System.out.println("1. PutarAngka");
        System.out.println("2. Segitiga Sama Kaki");
        System.out.println("3. Fibonacci");
        System.out.println("4. Exit");
        System.out.println("=========================================");
        System.out.print("Chose options: ");
        int choose = input.nextInt();
        System.out.println("=========================================");

        switch (choose) {
            case 1:
                PutarAngka.angkaBolakbalik();
                run();
                break;
            case 2:
                SegitigaSamaKaki.printSegitiga();
                run();
                break;
            case 3:
                Fibonacci.printFibonacci();
                run();
                break;
            case 4:
                break;
            default:
                System.out.println("Not found!");
                run();
        }
    }
}
