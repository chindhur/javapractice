import java.util.Scanner;

public class CountOfOddArray {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=scanner.nextInt();
        int[] numbers = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the array element "+(i+1)+":");
            numbers[i]=scanner.nextInt();
        }
        int sum = 0;
        int count =0;
        for (int i=0;i<size;i++){
            if(numbers[i] % 2 != 0){
                sum=sum+numbers[i];
                count++;
            }
        }
        System.out.println("the number of odd numbers in the array are:"+count);
        System.out.println("the sum of odd numbers is:"+sum);
    }
}
