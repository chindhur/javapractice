import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        //To check whether a number is prime number or not
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        boolean isPrime = isPrimeNumber(number);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        input.close();
    }

    // Method to check if a number is prime
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
