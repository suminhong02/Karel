import java.util.Scanner;

public class Password {

    public static void main(String []args){
        Scanner scan = new Scanner (System.in);
        System.out.print("First name: ");
        String first_name = scan.next();
        System.out.print("Middle name: ");
        String middle_name = scan.next();
        System.out.print("Last name: ");
        String last_name = scan.next();
        System.out.print("Age: ");
        String age = scan.next();
        String letter1 = (first_name.substring(first_name.length()/2,first_name.length()/2+1));
        String letter2 = (middle_name.substring(middle_name.length()/2,middle_name.length()/2+1));
        String letter3 = (last_name.substring(last_name.length()/2,last_name.length()/2+1));
        String letter4 = (first_name.substring(first_name.length()-1));
        System.out.println("Password: "+letter1.toUpperCase()+letter2.toUpperCase()+letter3.toUpperCase());






    }
}
