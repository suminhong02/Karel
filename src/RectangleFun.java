import java.awt.*;
import java.util.Scanner;

public class RectangleFun {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Width: ");
        int width = scan.nextInt();
        System.out.print("Height: ");
        int height = scan.nextInt();
        System.out.print("X: ");
        int x = scan.nextInt();
        System.out.print("Y: ");
        int y = scan.nextInt();

        Rectangle r = new Rectangle(x, y, width, height);
        double perimeter = (r.getWidth() + r.getHeight())*2;
        System.out.println("Perimeter = "+perimeter);
        int X = x - 4;
        int Y = y +2;
        r.setLocation(X,Y);
        System.out.print("New Location is "+ "(" +r.getX()+","+r.getY()+")");




    }

}
