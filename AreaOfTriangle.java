import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String args[]){
        //when base and height are given
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the height : ");
        int height = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter the base :");
        int base = scanner1.nextInt();
        int area = (base*height)/2;
        System.out.println("the area is :"+area);

        //when 3 sides of triangle are given
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("enter first side :");
        int side1= scanner2.nextInt();
        System.out.println("enter second side :");
        int side2= scanner2.nextInt();
        System.out.println("enter third side :");
        int side3= scanner2.nextInt();
        double s = (side1+side2+side3)/2;
        double area1 = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("the area of triangle is :"+area1);



    }
}
