package circle;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5, "blue");
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(2.5, 5.0, "green");
        System.out.println(cylinder.toString());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}