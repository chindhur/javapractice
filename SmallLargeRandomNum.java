import java.util.Random;
//40.Java Program to Find the Largest and Smallest Numbers From Random Numbers

public class SmallLargeRandomNum {
    public static void main(String[] args) {
        Random random = new Random();
        int numberOfNumbers = 10;
        int largeNumber = Integer.MIN_VALUE;
        int smallNumber = Integer.MAX_VALUE;
        for(int i = 0;i<numberOfNumbers;i++){
            int randomnumber = random.nextInt(100);
            if(randomnumber>largeNumber){
                largeNumber=randomnumber;
            }
            if(randomnumber<smallNumber){
                smallNumber=randomnumber;
            }
        }
        System.out.println(smallNumber);
        System.out.println(largeNumber);
    }
}
