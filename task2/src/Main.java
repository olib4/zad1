import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.printf("podaj liczbe");
        Scanner scan = new Scanner(System.in);
        int liczba = scan.nextInt();
        if (liczba > 0) {
            System.out.println("liczba wieksza od 0");


        }
        if (liczba < 0) {
            System.out.println("liczba mniejsza od 0");

        } else {
            System.out.println("liczba mniejsza od 0");

        }


    }
}