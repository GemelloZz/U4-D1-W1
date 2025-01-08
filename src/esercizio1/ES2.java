package esercizio1;
import java.util.Scanner;

public class ES2 {
    public static void es1() {
       Scanner scanner = new Scanner(System.in);
       System.out.print("inserisci il numero");
       int x = scanner.nextInt() ;


        switch (x) {
             case 0:
                System.out.println("zero");
                 break;
                 case 1:
                System.out.println("uno");
                 break;
                 case 2:
                System.out.println("due");
                 break;
                 case 3:
                System.out.println("tre");
                 break;
            default:
                System.out.println("numero non stampabile");
                break;
         }
         scanner.close();

    }
    public static void main(String[] args) {
        es1();
    }
}
