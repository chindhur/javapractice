import java.util.Scanner;

public class Fibonocci {

    public static void fibo(int range) {

        int num1 = 0;
        int num2 = 1;
        int counter = 0;

        while (counter < range) {
            System.out.print(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    public static void main(String[] args) {
        fibo(6);
    }

}