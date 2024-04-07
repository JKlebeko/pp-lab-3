import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

public class Main {
public static void main(String[] args) {
    Point point = new Point(3, 33.4);
    System.out.println("x="+point.getX()+", y="+point.getY());
Circle circle= new Circle(point,4);
    System.out.println("x="+circle.getCenter().getX()+", y="+circle.getCenter().getY()+", radius="+circle.getRadius());
    System.out.println("pole="+ circle.getArea()+", obw="+circle.calculatePerimeter());

    ColoredCircle coloredCircle=new ColoredCircle(point,3);
    System.out.println(coloredCircle.getColor());
}


}