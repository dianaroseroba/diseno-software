package circle;

//Circle class
public class Circle {
 protected double radius = 1.0;
 protected String color = "red";
 
 // Constructors
 public Circle() {}
 
 public Circle(double radius) {
     this.radius = radius;
 }

 public Circle(double radius, String color) {
     this.radius = radius;
     this.color = color;
 }

 // Getters and setters
 public double getRadius() {
     return radius;
 }

 public void setRadius(double radius) {
     this.radius = radius;
 }

 public String getColor() {
     return color;
 }

 public void setColor(String color) {
     this.color = color;
 }

 // Methods
 public double getArea() {
     return Math.PI * radius * radius;
 }

 @Override
 public String toString() {
     return "Circle[radius=" + radius + ", color=" + color + "]";
 }
}




