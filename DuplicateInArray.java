//to display repeated elements
public class DuplicateInArray {
    public static void main(String[] args){
        int[] array = {23,45,23,45,67,67,12,12};
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    System.out.println(array[j]);
                }
            }
        }
    }
}
