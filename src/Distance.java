import java.util.Scanner;

public class Distance {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the x coordinate of the first point: ");
        int first_x = scan.nextInt();
        System.out.println("Enter the y coordinate of the first point: ");
        int first_y = scan.nextInt();
        System.out.println("Enter the x coordinate of the second point: ");
        int second_x = scan.nextInt();
        System.out.println("Enter the y coordinate of the second point: ");
        int second_y = scan.nextInt();
        double x_coordinate = Math.pow(second_x-first_x,2);
        double y_coordinate = Math.pow(second_y-first_y,2);
        double distance = Math.sqrt(x_coordinate+y_coordinate);
        System.out.println("The distance between ("+first_x+", "+first_y+") and ("+second_x+", "+second_y+") is "+distance);

    }
}
