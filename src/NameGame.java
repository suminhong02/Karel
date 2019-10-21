import java.util.Scanner;

public class NameGame {
        public static void namegame(String name){
                System.out.println(name+" "+name+", bo-B"+name.substring(1));
                System.out.println("Banana-fana fo-F"+name.substring(1));
                System.out.println("Fee-fi-mo-M"+name.substring(1));
                System.out.println(name.toUpperCase()+"!");
        }
        public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your first name?");
        String first_name = scan.next();
        System.out.print("What is your last name?");
        String last_name = scan.next();

        namegame(first_name);
        namegame(last_name);

    }

}
