import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.println("enter the height in meters: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("the BMI is :" + bmi);

    }
}

