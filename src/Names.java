import java.util.Scanner;

public class Names {
    public static void main(String[]args){

        String first_name = "Mark";
        System.out.println("First name: "+first_name);
        String last_name = "Lee";
        System.out.println("Last name: "+last_name);
        System.out.println(last_name+" "+first_name);
        System.out.println(first_name.length() + last_name.length());
        System.out.println(first_name.substring(0,1)+last_name.substring(0,1));
        System.out.println(first_name.compareTo(last_name));
        System.out.println(last_name.indexOf('k'));
        System.out.println(first_name.indexOf('e'));
        String new_first = first_name.substring(0,first_name.length()/2)+last_name.substring(last_name.length()/2);
        String new_last = last_name.substring(0,last_name.length()/2)+first_name.substring(first_name.length()/2);
        System.out.println(new_first+" "+new_last);



    }
}
