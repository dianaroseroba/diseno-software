package animal;

//Animal class
public class Animal {
 protected String name;

 // Constructor
 public Animal(String name) {
     this.name = name;
 }

 // toString method
 @Override
 public String toString() {
     return "Animal[name=" + name + "]";
 }
}
