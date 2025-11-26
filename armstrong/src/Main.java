public class Main {
    public static void main(String[] args){

        int limit = 20000;

        if(limit < 1){
            System.out.println("Limit mora biti veći od nule.");
            return;
        }


        System.out.println("Armstrongovi brojevi između 1 i " + limit + " su:");

        for (int i = 1; i <= limit; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }

    }

    public static boolean isArmstrong(int number){
        int newNumber = number;
        int lastDigit;
        int sum = 0;

        while(newNumber > 0){
            lastDigit = newNumber % 10;
            sum += lastDigit * lastDigit * lastDigit;
            newNumber = newNumber / 10;
        }

        return number == sum;
    }
}
