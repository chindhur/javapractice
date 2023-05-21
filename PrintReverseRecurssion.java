import java.util.Scanner;

public class PrintReverseRecurssion {
    public static void printRecurssion(int number){
        if(number<0){
            return;
        }
        System.out.println (number);
        printRecurssion(number-1);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the range:");
        int n=scanner.nextInt();
        printRecurssion(n);
    }
}
