package geometry;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double newX) {
        this.x = newX;
    }
    public void setY(double newY) {
        this.y = newY ;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

}
