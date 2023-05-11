import java.util.Scanner;

public class SumOfNumbersArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numbers of array elements:");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i <n; i++) {
            System.out.println("Enter the element" + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i <n; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("sum of the array elements are:" + sum);
    }
}
