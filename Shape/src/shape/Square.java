package shape;

//Square class extending Rectangle
public class Square extends Rectangle {
//Constructors
public Square() {}

public Square(double side) {
super(side, side);
}

public Square(double side, String color, boolean filled) {
super(side, side, color, filled);
}

//Getter, Setter and Methods
public double getSide() {
return width; // width and length are same for a square
}

public void setSide(double side) {
setWidth(side);
setLength(side);
}

@Override
public void setWidth(double side) {
super.setWidth(side);
super.setLength(side);
}

@Override
public void setLength(double side) {
super.setLength(side);
super.setWidth(side);
}

@Override
public String toString() {
return "Square[" + super.toString() + "]";
}
}
