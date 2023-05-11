import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digits : ");
        int number = scanner.nextInt();
        int sum = 0;
        int digits;
        while ((number != 0)){
            digits = number % 10;
            sum += digits;
            number /= 10;
        }
        System.out.println("sum of digits is :" + sum);
    }
}

