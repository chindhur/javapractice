import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the operator:");
        char operator = scanner.nextLine().charAt(0);

        System.out.println("enter the first number :");
        double number1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double number2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                double result = number1 + number2;
                System.out.println("the result of addition:" + result);
                break;

            case '-':
                double result1 = number1 + number2;
                System.out.println("result of subtraction:" + result1);
                break;

            case '*':
                double result2= number1 * number2;
                System.out.println("result of multiplication" + result2);
                break;

            case '/':
                double result3 = number1 / number2;
                System.out.println("result of Division is" + result3);
        }
    }
}
