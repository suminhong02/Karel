//Sumin Hong
//10/25/2019
//Use Math class and square roots to find a letter indexed by the square root of its length.
import java.util.Scanner;

public class SquareWordRoot {

    public static void main(String[]args){
        System.out.print("Enter your word: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        double sqrt = Math.sqrt((double)word.length());
        char result = word.charAt((int)sqrt);
        System.out.println("The \"square root\" of "+word+" is "+result);
    }
}
