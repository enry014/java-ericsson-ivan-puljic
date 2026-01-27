import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi recenicu: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s+");


        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

    }
}
