import java.util.Scanner;
//to find number of odd numbers in array
// and find maximum element of the array

public class FindOddAndMaxInArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of elements in array:");
        int n= scanner.nextInt();

        int[] numbers=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter the element"+(i+1)+":");
            numbers[i]=scanner.nextInt();
        }
        int oddcount=0;
        for(int i=0;i<n;i++){
            if(numbers[i] % 2 != 0){
            oddcount++;
            }
        }
        System.out.println("the number of odd numbers are:"+oddcount);

        //To find maximum number in the array
        int max= numbers[0];
        for(int i = 0;i<n;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("The maximum element of the array is :"+max);
    }
}
