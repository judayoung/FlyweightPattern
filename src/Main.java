import flyweight.Circle;
import flyweight.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Let's use Flyweight Pattern to save memories.\n");

        String[] colorArray = {"Red", "Yellow", "Green", "Blue"};
        for (int i = 0; i < 10; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(colorArray[(int) (Math.random() * 4)]);
            circle.setX((int) (Math.random() * 100));
            circle.setY((int) (Math.random() * 200));
            circle.setRadius((int) (Math.random() * 8));
            circle.draw();
        }
    }
}