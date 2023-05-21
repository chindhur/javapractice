import java.util.Scanner;

public class FibonocciRecursion {
    public static int findFibonocci(int n){
        if((n==0)||(n==1))
            return 0;

        if(n==2)
            return 1;

        return findFibonocci(n-1)+findFibonocci(n-2);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n to find fibonocci:");
        int n=scanner.nextInt();
        System.out.println(findFibonocci(n));
    }
}
