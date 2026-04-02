import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // original
        System.out.println("Unesite putanju do originalne datoteke:");
        String filePathOriginal = scanner.nextLine();
        File original = new File(filePathOriginal);

        // provjera postoji li izvorna datoteka i imamo li prava
        if (!original.exists()) {
            System.out.println("Izvorna datoteka ne postoji!");
            scanner.close();
            return;
        }
        if (!original.canRead()) {
            System.out.println("Nemate prava za čitanje!");
            scanner.close();
            return;
        }
        if (original.exists() && !original.canWrite()) {
            System.out.println("Nemate prava za pisanje!");
            return;
        }


        // kopija
        String filePathCopy;
        File fileCopy;

        while (true) {
            System.out.println("Unesite putanju i naziv kopije:");
            filePathCopy = scanner.nextLine();
            fileCopy = new File(filePathCopy);

            if (fileCopy.exists()) {
                System.out.println("Datoteka već postoji. Želite li prepisati (D/N)?");
                String odgovor = scanner.nextLine();

                if (odgovor.equalsIgnoreCase("D")) {
                    break;
                } else {
                    System.out.println("Odaberite drugo ime datoteke.");
                }
            } else {
                break;
            }
        }

        // kopiranje
        try (FileInputStream fis = new FileInputStream(filePathOriginal);
             FileOutputStream fos = new FileOutputStream(filePathCopy)) {

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
        if (fileCopy.exists()) {
            System.out.println("Kopija datoteke je uspješno napravljena!");
        } else {
            System.out.println("Greška: Kopija datoteke nije kreirana!");
            scanner.close();
            return;
        }


        // brisanje
        System.out.println("Želite li izbrisati kopiju datoteke (D/N)?");
        String deleteFile = scanner.nextLine();
        if (deleteFile.equalsIgnoreCase("D")) {
            if (fileCopy.exists()) {
                if (fileCopy.delete()) {
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
