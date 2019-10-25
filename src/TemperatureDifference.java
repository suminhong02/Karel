import java.util.Scanner;

public class TemperatureDifference {
    public static void main(String []args){
        System.out.print("Enter the first temperature: ");
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        System.out.print("Enter the second temperature: ");
        int second = scan.nextInt();
        int diff = Math.abs(first-second);
        System.out.println("The temperature changed "+diff+" degrees.");
    }
}
