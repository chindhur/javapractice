import java.util.Scanner;
//11.Java program to find the geometric mean of n numbers

public class GeometricMean {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of integers:");
        int count = scanner.nextInt();
        int product =1;
        for(int i = 0;i<count;i++){
            System.out.println("enter number"+(i+1)+":");
            int numbers= scanner.nextInt();
            product=product*numbers;
        }
        double mean=Math.pow(product,1.0/count);
        System.out.println("mean is :"+mean);
    }
}
