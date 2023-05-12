import java.util.Arrays;

public class DeleteElementArray {
    public static void main(String[] args){
        int[] array = new int[]{23,34,54,63,12};
        int indToDelete = 2;
        System.out.println("the original array:"+ Arrays.toString(array));

        //creating new array with one position less
        int [] newarray = new int[array.length-1];

        //copy elements before index
        for(int i=0;i <indToDelete;i++){
            newarray[i]=array[i];
        }

        //copy elements after index
        for(int i = indToDelete+1; i< array.length; i++){
            newarray[i]=array[i];
        }
        System.out.println("Array after deleting:"+Arrays.toString(newarray));
    }
}
