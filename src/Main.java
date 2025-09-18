import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Prime number checker!");
        int myNumber = getUserInput();
        boolean isPrime = isPrime(myNumber);
        System.out.printf("Is %d a prime? Answer is %b", myNumber, isPrime);
    }
    public static boolean isPrime(int num) {
        if(num < 2) {
            return false;
        }
        for(int n = 2; n < num; n++) {
            if(num % n == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getUserInput() {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a whole number: ");
            if(scanner.hasNextInt()) {
                int myNumber = scanner.nextInt();
                scanner.close();
                return myNumber;
            } else {
                scanner.next();
                System.out.println("Please enter a whole number!!!");
            }
        }
    }
}