import java.util.Scanner;

public class SeparatingDigits {

    public static int quotient(int number) {
        number = number/10;
        return number;

    }

    public static int remainder(int number2) {
        int number = number2%10;
        return number;

    }
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a four digit number:");
        int four = scan.nextInt();
        int fourth = remainder(four);
        int three = quotient(four);
        int third = remainder(three);
        int two = quotient(three);
        int second = remainder(two);
        int first = quotient(two);

        System.out.println(first+" "+second+" "+third+" "+fourth);




    }
}
