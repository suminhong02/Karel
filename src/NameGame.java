import java.util.Scanner;

public class NameGame {

        public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your first name?");
        String first_name = scan.next();
        System.out.print("What is your last name?");
        String last_name = scan.next();
        System.out.println(first_name+" "+first_name+", bo-B"+first_name.substring(1));
        System.out.println("Banana-fana fo-F"+first_name.substring(1));
        System.out.println("Fee-fi-mo-M"+first_name.substring(1));
        System.out.println(first_name.toUpperCase()+"!");
        System.out.println(" ");
        System.out.println(last_name+" "+last_name+", bo-B"+last_name.substring(1));
        System.out.println("Banana-fana fo-F"+last_name.substring(1));
        System.out.println("Fee-fi-mo-M"+last_name.substring(1));
        System.out.println(last_name.toUpperCase()+"!");
    }

}
