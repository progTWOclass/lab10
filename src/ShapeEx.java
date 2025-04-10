public class ShapeEx {
    public static void showArea(Shape s){
        double area = s.area();
        System.out.println("the area of the shape is " + area);
    }

    public static void main(String[] args) {
        Circle c = new Circle(4.0);
        Rectangle r = new Rectangle(4,3);

        //display the area of anything that implements the shape interface
        showArea(c);
        showArea(r);
    }
}
