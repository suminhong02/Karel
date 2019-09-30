import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Dimension;
import java.util.Scanner;

public class PointsAndRectangles {

    public static void main(String []args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the x coordinate: ");
        int x = scan.nextInt();
        System.out.print("Enter the y coordinate: ");
        int y = scan.nextInt();
        System.out.print("Enter the length: ");
        int length = scan.nextInt();
        System.out.print("Enter the width: ");
        int width = scan.nextInt();
        Point p = new Point(x, y);
        System.out.println(p);
        Dimension d = new Dimension(length, width);
        System.out.println(d);
        Rectangle r = new Rectangle(x, y, length, width);
        System.out.println(r);





    }
}
