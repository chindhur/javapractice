import java.util.Scanner;

public class AreaAndCircumference {
    public static void main(String[] args) {
        //Circumference of Circle = 2 x PI x Radius
        //Area of Circle = PI X Radius X Radius

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius=scanner.nextDouble();
        double circumference = 2*Math.PI*radius;
        double area = Math.PI*radius*radius;
        System.out.println("circumference:"+circumference);
        System.out.println("area :"+area);
    }
}
