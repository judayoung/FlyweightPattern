package flyweight;

public interface ShapeFlyweight {

    void draw();

    String getColor();

    void setRadius(int radius);
    void setX(int x);
    void setY(int y);

}
