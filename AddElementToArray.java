import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddElementToArray {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Array:" + Arrays.toString(arr));
        List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
        arrayList.add(7);
        arr = arrayList.toArray(arr);
        System.out.println("Array after adding element: " + Arrays.toString(arr));
    }
}
