import HM8.Circle;
import HM8.Oval;
import HM8.Quad;
import HM8.Star;
import com.sun.javafx.geom.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Oval oval = new Oval();
        Star star = new Star();
        Quad quad = new Quad();
        circle.setName("Коло");
        System.out.println(circle);
    }
}