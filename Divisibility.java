import java.util.Scanner;

public class Divisibility {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number to check :");
        int number =scanner.nextInt();
        if(number % 5 ==0 && number % 7 == 0){
            System.out.println("The number is divisible by 5 and 7");
        }else{
            System.out.println("The number is not divisible by 5 and 7");
        }
    }
}
