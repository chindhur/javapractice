import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the year:");
        int year = scanner.nextInt();
        boolean isLeapYear;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)        // if year is divided by 400 then it is a leap year

                    isLeapYear = true;
                else
                    isLeapYear = false;
            } else
                isLeapYear = true; //if Divisible by 4 but not by 100, it's a leap year

        } else isLeapYear = false;

        if(isLeapYear){
            System.out.println("it is leap year");
        }else
            System.out.println("it is not leap year");
    }

}
