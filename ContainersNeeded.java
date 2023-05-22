import java.util.Scanner;

public class ContainersNeeded {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the volume of liquid: ");
        double volume = scanner.nextDouble();
        System.out.println("enter the capacity of container: ");
        double conCapacity = scanner.nextDouble();
        double NumberOfCont = Math.ceil(volume / conCapacity);
        System.out.println("Number of containers required are:" + NumberOfCont);
    }
}
