import java.util.Scanner;
public class DivisibilityInRange {

    public static void main(String[] args){
        System.out.println("Multiples of 3 within range 10 and 50");

        for(int i =10;i<=50;i++){

            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
