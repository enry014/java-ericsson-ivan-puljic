import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        int[] novcanice = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        double kusur = 1978;
        int iznos = (int) Math.round(kusur * 100);

        for (int novcanica : novcanice) {
            int komada = iznos / novcanica;
            if (komada > 0) {

                if (novcanica >= 100) {
                    System.out.println(komada + " * " + (novcanica / 100));
                } else {
                    System.out.printf("%d * %.2f%n", komada, novcanica / 100.0);
                }

                iznos %= novcanica;
            }
        }
        
    }
}
