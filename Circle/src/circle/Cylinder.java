package circle;

//Cylinder class extending Circle
public class Cylinder extends Circle {
 protected double height = 1.0;

 // Constructors
 public Cylinder() {}

 public Cylinder(double radius) {
     super(radius);
 }

 public Cylinder(double radius, double height) {
     super(radius);
     this.height = height;
 }

 public Cylinder(double radius, double height, String color) {
     super(radius, color);
     this.height = height;
 }

 // Getters and setters
 public double getHeight() {
     return height;
 }

 public void setHeight(double height) {
     this.height = height;
 }

 // Methods
 public double getVolume() {
     return getArea() * height;  // Area from Circle * height
 }
}

