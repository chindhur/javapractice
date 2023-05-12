import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the String :");
        String string = scanner.nextLine();
        String reverse = "";
        for(int i =string.length()-1; i>=0; i--){
            reverse=reverse+string.charAt(i);
        }
        if(string.equals(reverse)){
            System.out.println("The String is Palindrome");
        }else{
            System.out.println("The String is not a palindrome");
        }



    }
}
