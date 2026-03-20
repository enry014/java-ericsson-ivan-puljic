import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // original
        System.out.println("Unesite putanju do originalne datoteke:");
        String file_path_original = scanner.nextLine();
        File original = new File(file_path_original);

        // provjera postoji li izvorna datoteka i imamo li prava
        if(!original.exists()) {
            System.out.println("Izvorna datoteka ne postoji!");
            scanner.close();
            return;
        }
        if(!original.canRead()) {
            System.out.println("Nemate prava za čitanje ili pisanje izvorne datoteke!");
            scanner.close();
            return;
        }


        // kopija
        System.out.println("Unesite putanju i naziv kopije:");
        String file_path_copy = scanner.nextLine();
        File file_copy = new File(file_path_copy);

        if(file_copy.exists()) {
            System.out.println("Datoteka već postoji. Želite li prepisati (D/N)?");
            String odgovor = scanner.nextLine();
            if (!odgovor.equalsIgnoreCase("D")) {
                System.out.println("Odaberite drugo ime datoteke.");
                scanner.close();
                return;
            }
        }

        // kopiranje
        try (FileInputStream fis = new FileInputStream(file_path_original);
             FileOutputStream fos = new FileOutputStream(file_path_copy)) {

            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }

            System.out.println("Kopiranje završeno!");
        } catch (IOException e) {
            System.out.println("Došlo je do greške: " + e.getMessage());
            scanner.close();
            return;
        }

        // provjera
        if(file_copy.exists()) {
            System.out.println("Kopija datoteke je uspješno napravljena!");
        } else {
            System.out.println("Greška: Kopija datoteke nije kreirana!");
            scanner.close();
            return;
        }


        // brisanje
        System.out.println("Želite li izbrisati kopiju datoteke (D/N)?");
        String delete_file = scanner.nextLine();
        if(delete_file.equalsIgnoreCase("D")) {
            if(file_copy.exists()) {
                if(file_copy.delete()) {
                    System.out.println("Kopija je uspješno obrisana!");
                } else {
                    System.out.println("Ne mogu obrisati datoteku!");
                }
            } else {
                System.out.println("Datoteka ne postoji.");
            }
        }

        scanner.close();

    }
}
