import java.util.Scanner;

public class AvgAndProduct {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                //to find average of integers
                System.out.print("Enter the number of integers: ");
                int count = input.nextInt();
                int sum = 0;
                for (int i = 0; i < count; i++) {
                    System.out.print("Enter integer " + (i+1) + ": ");
                    int num = input.nextInt();
                    sum += num;
                }
                double average = (double) sum / count;
                System.out.println("The average is: " + average);

                //to find product of real numbers
                double product=1.0;
                Scanner sc = new Scanner(System.in);
                for(int j=0;j<count;j++) {
                    System.out.println("enter the real number" + (j + 1) + ":");
                    double number = sc.nextDouble();
                    product = product * number;
                }
                    System.out.println("The product of real numbers are:"+product);

                //average of 5 numbers using while loop
                Scanner scanner = new Scanner(System.in);
                double sum1 = 0;
                int count1= 0;
                while(count1 < 5){
                    System.out.println("enter the number "+ (count1+1) +":");
                    int number2= sc.nextInt();;
                    sum1=sum1+number2;
                    count1++;
                }
                double avg=sum1/5;
                System.out.println("the average of 5 numbers using while loop is:"+avg);
                scanner.nextInt();
                }
            }



