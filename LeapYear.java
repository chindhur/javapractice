import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the year:");
        int year = scanner.nextInt();

        if(isLeap(year)){
            System.out.println("it is Leap year");
        }
        else{
            System.out.println("it is not Leap year");
        }
    }

    public static boolean isLeap(int year){
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            return true;
        }
        else{
            return false;
        }
    }
}