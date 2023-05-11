public class DisplayIntegers {
    public static void main(String[] args) {
        System.out.println("numbers within range 100 to 150 whose sum of digits is even number");

        for (int i = 100; i <= 150; i++) {
            int number = i;
            int sum = 0;
            while (number != 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            if (sum % 2 == 0) {
                System.out.println("The numbers are :" + i);
            }
        }
    }
}

