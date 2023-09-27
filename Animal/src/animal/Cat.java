package animal;


//Cat class extending Mammal
public class Cat extends Mammal {

//Constructor
public Cat(String name) {
 super(name);
}

//greets method
public void greets() {
 System.out.println("Meow");
}

//toString method
@Override
public String toString() {
 return "Cat[" + super.toString() + "]";
}
}
