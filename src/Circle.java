public class Circle implements Shape{
    private double radius;

    public Circle(){
        radius = 0;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}
