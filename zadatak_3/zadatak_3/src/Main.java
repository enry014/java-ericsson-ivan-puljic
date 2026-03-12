import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Ucilica ucilica = new Ucilica();

        boolean radi = true;

        while (radi) {

            System.out.println("\nOdaberi lik:");
            System.out.println("1 - Krug");
            System.out.println("2 - Pravokutnik");
            System.out.println("3 - Trokut");
            System.out.println("0 - Kraj unosa");

            int izbor = sc.nextInt();

            switch (izbor) {

                case 1:
                    while (true) {
                        try {
                            System.out.print("Unesi radijus: ");
                            double r = sc.nextDouble();
                            ucilica.dodaj(new Krug("Krug", r));
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Greška: " + e.getMessage());
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        try {
                            System.out.print("Stranica a: ");
                            double a = sc.nextDouble();
                            System.out.print("Stranica b: ");
                            double b = sc.nextDouble();

                            ucilica.dodaj(new Pravokutnik("Pravokutnik", a, b));
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Greška: " + e.getMessage());
                        }
                    }
                    break;

                case 3:
                    while (true) {
                        try {
                            System.out.print("Stranica a: ");
                            double a = sc.nextDouble();
                            System.out.print("Stranica b: ");
                            double b = sc.nextDouble();
                            System.out.print("Stranica c: ");
                            double c = sc.nextDouble();

                            ucilica.dodaj(new Trokut("Trokut", a, b, c));
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Greška: " + e.getMessage());
                        }
                    }
                    break;

                case 0:
                    radi = false;
                    break;

                default:
                    System.out.println("Nepoznat izbor.");
            }
        }

        System.out.println("\nUneseni likovi:");
        ucilica.ispisiSve();

        System.out.println("\nSortirani po površini:");
        ucilica.sortirajPoPovrsini();
        ucilica.ispisiSve();

        sc.close();


    }
}
