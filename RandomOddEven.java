import java.util.Random;

public class RandomOddEven {
    public static void main(String[] args){
        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;
        System.out.println("the random number is :"+randomNumber);

        if(randomNumber % 2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}
