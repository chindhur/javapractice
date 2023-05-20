import java.util.Scanner;

public class ReverseIntegerParse {
    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the integer :");
        int number = scanner.nextInt();
        String reverseString = "";

        //converting the integer to string
        String str = Integer.toString(number);

        //taking loop from the last number and decrementing towards front

        for(int i=str.length() -1; i >= 0; i--) {
            reverseString += str.charAt(i);
        }
        int reverse = Integer.parseInt(reverseString); //converting back to string
        System.out.println("reversed string is:"+reverse);


        //to reverse a string
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String string1 = sc.nextLine();
        String rev = "";
        for(int i =string1.length()-1;i>=0;i--) {
            rev += string1.charAt(i);
        }
        System.out.println("the reversed string is:"+rev.toString());
        }
    }
