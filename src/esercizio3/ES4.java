package esercizio3;

import java.util.Scanner;

public class ES4 {
    public static void es4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci un numero");
        int x = scanner.nextInt() ;
        for (int i = 0; i <= x;i-- ) {
            System.out.println(i);

        }
        scanner.close();
    }
    public static void main(String[] args) {
        es4();
    }
}
