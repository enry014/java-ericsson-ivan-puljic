public class Main {
    public static void main(String[] args){

        for (int i = 1; i <= 9999; i++){
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
