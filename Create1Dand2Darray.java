import java.util.Arrays;
import java.util.Scanner;

public class Create1Dand2Darray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1 for 1 dimensional array,2 for 2 dimensional array:");
        int arrayType = scanner.nextInt();

        if (arrayType == 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENter size of array:");
            int size = sc.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.println("enter element " + (i + 1) + ":");
                array[i] = sc.nextInt();
                System.out.println("the elements of 1D array are"+ (Arrays.asList(array[i])));
            }
        }if(arrayType ==2){
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("enter number of rows:");
            int rows= scanner1.nextInt();
            System.out.println("enter number of columns:");
            int columns= scanner1.nextInt();
            int [][] array1 = new int[rows][columns];
            System.out.println("enter the elements of 2D array:");
            for(int i = 0;i<rows;i++) {
                for (int j = 0; j < columns; i++) {

                    array1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("the 2D array elements are:");
            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;i++){
                    System.out.print(array1[rows][columns]+" ");
                }System.out.println();
            }
        }
    }
}
