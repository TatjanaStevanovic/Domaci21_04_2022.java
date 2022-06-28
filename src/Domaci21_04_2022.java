import java.util.Scanner;

public class Domaci21_04_2022 {
    public static void main(String[] args) {
 // Program ispisuje najveci broj od tri uneta
        Scanner broj = new Scanner(System.in); // Pozivanje funkcije skener

        System.out.println("Unesi TRI DECIMALNA BROJA!"); // Uputstvo sta korisnik treba da radi
        System.out.println(); // Stampa prazan red


        System.out.println("Unesi prvi decimalni broj: ");
        double a = broj.nextDouble(); // Unos prvog broja

        System.out.println("Unesi drugi decimalni broj: ");
        double b = broj.nextDouble(); // Unos drugog broja

        System.out.println("Unesi treci decimalni broj: ");
        double c = broj.nextDouble(); // Unos treceg broja
 // Ispitivanje uslova
        if (a > b && a > c) {
            System.out.println("Najveci broj je: " + a);

        }
        if (b > a && b > c) {
            System.out.println("Najveci broj je: " + b);
        }

        if (c > a && c > b) {
            System.out.println("Najveci broj je: " + c);

        }
    }
}