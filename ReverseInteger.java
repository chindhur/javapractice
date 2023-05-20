import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the integer");
        int number = scanner.nextInt();
        int reverse=0;
        while (number != 0) {
            int digits = number % 10;
            reverse = reverse * 10 + digits;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
