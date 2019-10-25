import java.util.Scanner;

public class Courses {
    public static void main(String []args){
        System.out.print("What is the description of the course?");
        Scanner scan = new Scanner(System.in);
        String description = scan.nextLine();

        int first = description.indexOf(" ");
        String department = description.substring(0,first);
        System.out.println("Department: "+department);
        int second = description.indexOf(" ",first+1);
        String course_number = description.substring(first ,second);
        System.out.println("Course Number: "+course_number);
        String title = description.substring(second);
        System.out.println("Title: "+title);


    }
}
