import java.util.Scanner;

//38. Write a Java program to count letters, spaces, numbers and other characters in an input string.
public class CountLetterspace {
    public static void count(String x) {
        char[] chars = x.toCharArray();
        int letter = 0;
        int digit = 0;
        int whitespace = 0;
        int other = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(chars[i])) {
                letter++;
            } else if (Character.isDigit(chars[i])) {
                digit++;
            } else if (Character.isWhitespace(chars[i])) {
                whitespace++;
            } else {
                other++;
            }
        }
        System.out.println("the number of letters are :"+letter);
        System.out.println("the number of digits are:" + digit);
        System.out.println("the number of whitespace are:" + whitespace);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string:");
        String str = scanner.nextLine();
        count(str);
    }
}