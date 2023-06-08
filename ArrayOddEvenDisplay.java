import java.util.Arrays;

//To display array elements in odd and even positions
public class ArrayOddEvenDisplay {
    public static void main(String[] args) {
        int[] array = {22, 34, 56, 78, 89, 32, 29};
        System.out.println("All the elements :" + Arrays.toString(array));
        System.out.println("Elements in odd position :");
        for (int i = 0; i < array.length; i= i+2) {
            System.out.println(array[i]);
        }
        System.out.println("Elements in even position:");
        for(int i=1;i<array.length;i=i+2){
            System.out.println(array[i]);
        }
    }
}
