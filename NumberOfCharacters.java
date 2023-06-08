package stringPrograms;
//to count number of characters in string
public class NumberOfCharacters {
    public static void main(String[] args){
        String string = "The java programming";
        int count=0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)!= ' '){
                count++;
            }
        }
        System.out.println("the number of elements are:"+count);
    }
}
