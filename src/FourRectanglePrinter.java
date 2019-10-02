import java.awt.*;

public class FourRectanglePrinter {

    public static void main(String []args){

        Rectangle box = new Rectangle(0,0,2,3);
        System.out.println(box);
        box.translate(2,0);
        System.out.println(box);
        box.translate(2,3);
        System.out.println(box);
        box.translate(0,3);
        System.out.println(box);

    }
}
