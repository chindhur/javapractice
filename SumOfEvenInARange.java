import java.util.Scanner;

public class SumOfEvenInARange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter start range:");
        int startRange = scanner.nextInt();
        System.out.println("enter end range :");
        int endRange = scanner.nextInt();
        int sum=0;
        for (int i =startRange; i <= endRange; i++){
            if (i % 2 == 0) {
                System.out.println("The even numbers in the range are :"+i);
                sum += i;
            }
        }
    System.out.println("the sum of even  numbers :"+sum);
    }
}
