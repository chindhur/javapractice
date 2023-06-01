import java.util.Scanner;
//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.

public class Compute {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int n=scanner.nextInt();
        System.out.printf("%d + %d%d + %d%d%d\n", n, n, n, n, n, n);

    }

}
