import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String user_input;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesi niz znakova: ");

        user_input = scanner.nextLine();

        int letters = 0;
        int numbers = 0;
        int other = 0;
        int length = user_input.length();

        for (char c : user_input.toCharArray()) {
            if (Character.isLetter(c)) {
                letters++;
            }

            if (Character.isDigit(c)) {
                numbers++;
            }

        }

        other = length - letters - numbers;

        System.out.println("Slova: " + letters + "\nBrojevi: " + numbers + "\nOstali znakovi: " + other);


    }
}

