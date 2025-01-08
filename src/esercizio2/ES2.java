package esercizio2;
import java.util.Scanner;

public class ES2 {
    public static void es2() {
        Scanner scanner = new Scanner(System.in);

        String letter = "";


        while (!letter.equalsIgnoreCase(":q")) {
            System.out.print("Inserisci una parola (scrivi ':q' per terminare): ");
            letter = scanner.next();


            if (!letter.equalsIgnoreCase(":q")) {

                String[] words = letter.split("");


                int i = 0;
                while (i < words.length) {
                    System.out.println(words[i]);
                    i++;
                }
            }
        }

        System.out.println("Programma terminato.");
        scanner.close();
    }

    public static void main(String[] args) {
        es2();
    }
}
