package HM8;

import HM8.Circle;
import HM8.Oval;
import HM8.Quad;
import HM8.Star;

public class Main {
    public static void main(String[] args) {

        // в даному блоці я створюю екземпляри класів фігури
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Oval oval = new Oval();
        Star star = new Star();
        Quad quad = new Quad();
        Shape shape = new Shape();

        // в даному блоці я присвоюю ім'я фігурам через метод set
        circle.setName("Коло");
        oval.setName("Овал");
        star.setName("Зірка");
        quad.setName("Квадрат");
        rectangle.setName("Прямокутник");
        shape.setName("Фігура");

        // в даному блоці я вивиджу в консоль назви фігур
        System.out.println(circle);
        System.out.println(oval);
        System.out.println(star);
        System.out.println(quad);
        System.out.println(rectangle);
        System.out.println(shape);
    }
}