package animal;


//Mammal class extending Animal
public class Mammal extends Animal {

// Constructor
public Mammal(String name) {
   super(name);
}

// toString method
@Override
public String toString() {
   return "Mammal[" + super.toString() + "]";
}
}
