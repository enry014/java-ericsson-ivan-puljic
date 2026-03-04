import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){

        // List<GeometrijskiLik> likovi = new ArrayList<>();

        // likovi.add(new Krug("Krug1", 5));
        // likovi.add(new Pravokutnik("Prav1", 4, 6));
        // likovi.add(new Trokut("Trok1", 3, 4, 5));

        // Collections.sort(likovi);

        Ucilica ucilica = new Ucilica();

        ucilica.dodaj(new Krug("Krug2", 6));
        ucilica.dodaj(new Krug("Krug3",2));
        ucilica.dodaj(new Pravokutnik ("Prav2", 5,9));
        ucilica.dodaj(new Trokut("Trok2", 2,5,6));

        ucilica.ispisiSve();
        ucilica.sortirajPoPovrsini();

        System.out.println("Sortirano po površini: \n");
        ucilica.ispisiSve();

        // System.out.println(likovi.toString());


    }
}
