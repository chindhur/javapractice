import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length :");
        double length = scanner.nextDouble();
        System.out.println("enter breadth :");
        double breadth=scanner.nextDouble();
        double area;
        area = length * breadth;
        System.out.println("the area of rectangle:"+area);
    }
}
