package flyweight;

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<String, ShapeFlyweight> createdCircleMap = new HashMap<>();

    public static ShapeFlyweight getCircle(String color) {
        ShapeFlyweight circle = createdCircleMap.get(color);
        if (circle == null) circle = createCircleAndPutMap(color);

        return circle;
    }

    private static ShapeFlyweight createCircleAndPutMap(String color) {
        ShapeFlyweight circle = new Circle(color);
        createdCircleMap.put(((Circle) circle).getColor(), circle);
        System.out.println("=== 새로운 객체 생성 : " + color + "색 원 ===");
        return circle;
    }

}
