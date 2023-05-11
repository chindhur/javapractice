import java.util.Scanner;

public class PrimenumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number until prime number has to be generated:");
        int n = scanner.nextInt();
        System.out.println("The prime numbers from 1 to" +n+ "are :");
        for (int i = 2; i <= n; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i+" ");
            }
        }
    }

    public static boolean isPrimeNumber(int number){
        if (number <=0){
            return false;
        }
       for(int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
       return true;
    }
}
