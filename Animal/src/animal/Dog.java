package animal;


//Dog class extending Mammal
public class Dog extends Mammal {

//Constructor
public Dog(String name) {
super(name);
}

//greets method
public void greets() {
System.out.println("Woff");
}

public void greets(Dog another) {
System.out.println("Woooooff");
}

//toString method
@Override
public String toString() {
return "Dog[" + super.toString() + "]";
}
}
