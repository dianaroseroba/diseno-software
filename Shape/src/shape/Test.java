package shape;


//Main class to test the classes
public class Test {
public static void main(String[] args) {
Circle circle = new Circle(2.5, "blue", false);
System.out.println(circle.toString());

Rectangle rectangle = new Rectangle(2.5, 4.0, "green", true);
System.out.println(rectangle.toString());

Square square = new Square(3.0, "yellow", true);
System.out.println(square.toString());
}
}
