import java.util.Scanner;

public class PalindromeCheck {

    public static void checkString(String string){
        String reverse="";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse = reverse + string.charAt(i);
        }
        System.out.println("the reversed string is:" + reverse);
        if (reverse.equals(string)) {
            System.out.println(string + " is palindrome");
        } else {
            System.out.println(string + "is not palindrome");
        }

    }

    public static void checkInteger(int integer){
        int wholeNumber=0;
        int original=integer;
        System.out.println("working with integer:");
        while(integer!=0){
            int digit = integer%10;
            wholeNumber=wholeNumber*10;
            wholeNumber=wholeNumber+digit;
            integer=integer/10;
        }
        System.out.println("the integer is:"+wholeNumber);
        if(wholeNumber ==original){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }

    }
    public static void main(String[] args) {

        checkString("bob");
        checkInteger(12321);
    }
}
