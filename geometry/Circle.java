package geometry;

public class Circle {

private Point center;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }
    public double getArea(){
        return Math.PI*(Math.pow(getRadius(),2));
    }
    public double calculatePerimeter(){
return 2*Math.PI*getRadius();
    }
    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

}
