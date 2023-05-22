import java.util.Random;

public class LargeSmallRandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 10;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
             numbers[i]=random.nextInt(100);
        }
        int smallNumber = numbers[0];
        int largeNumber = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > largeNumber)
                largeNumber = numbers[i];
            if (numbers[i] < smallNumber)
                smallNumber = numbers[i];
        }

        for (int num : numbers) {
            System.out.println(num + " ");
        }
        System.out.println();
        System.out.println(largeNumber);
        System.out.println(smallNumber);
    }
    }

