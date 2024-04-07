package geometry;

public class ColoredCircle extends Circle{
    public ColoredCircle(Point center, int radius) {
        super(center, radius);
    }

private String color;


    public String getColor() {
        return color;
    }
}
