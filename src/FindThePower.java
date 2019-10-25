import java.util.Scanner;

public class FindThePower {

    public static void main(String [] args){
        System.out.print("Enter the base: ");
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scan.nextInt();
        double power = Math.pow((double)base, (double)exponent);
        System.out.println(base+"^"+exponent+" = "+power);
    }
}
