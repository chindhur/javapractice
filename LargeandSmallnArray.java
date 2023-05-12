import java.util.Scanner;

public class LargeandSmallnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int size =scanner.nextInt();

        int[] numbers = new int[size];
        for(int i=0;i<size;i++) {
            System.out.println("enter element" + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }
        int sum=0;
        int smallest = numbers[0];
        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest)
                largest = numbers[i];
            else if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            sum = sum+numbers[i];
        }
        System.out.println("smallest number  :" + smallest);
        System.out.println("Largest number :" + largest);
        System.out.println("sum of the elements are:"+sum);
    }
}


