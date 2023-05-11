import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddElementToArray {
    public static void addElements(Integer[] arr,int position,int element){
        List<Integer>list = new ArrayList<Integer>(Arrays.asList(arr));

        list.add(position-1,element);

        arr = list.toArray(arr);

        System.out.println("original array"+Arrays.toString(arr));







    }
}
