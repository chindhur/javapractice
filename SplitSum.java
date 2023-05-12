public class SplitSum {

    public static void main(String[] args){
        String str = "asdfGGkjcl";
        System.out.println("The original string is :"+str);
        splitFor(str);
    }
    public static void splitFor(String str) {
        int coordinate = 0;
        for (int i = 0; i < str.length(); i++) {
            coordinate++;
            if (str.charAt(i) == (str.charAt(i + 1))) {
                break;
            }
        }

        String firstSubString = str.substring(0, coordinate);
        String secondSubString = str.substring(coordinate);

        System.out.println( firstSubString + "\n" + secondSubString);
        System.out.println("First String Length: " + firstSubString.length() + "\nSecond String Length: " + secondSubString.length());
    }

}
