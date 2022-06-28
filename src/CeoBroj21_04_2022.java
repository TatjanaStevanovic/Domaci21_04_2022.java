import java.util.Scanner;

public class CeoBroj21_04_2022 {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        System.out.println("Unesi jedan ceo broj!: "); // Uputstvo za korisnika
        int x = c.nextInt() ;  //Unos broja

        //Ispitivanje uslova
        if (x>0)  {
            System.out.println("Uneti broj " + x +" je pozitivan: ");
        }

        if (x<0)  {
            System.out.println("Uneti broj " + x +" je negativan: ");
        }

        if (x==0) {
            System.out.println("Uneti broj " + x +" je nula: ");
        }
    }


}
