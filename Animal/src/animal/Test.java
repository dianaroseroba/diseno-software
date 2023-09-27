package animal;

//Main class to test the classes
public class Test {
public static void main(String[] args) {
Cat cat = new Cat("Tom");
System.out.println(cat.toString());
cat.greets();

Dog dog1 = new Dog("Lukas");
Dog dog2 = new Dog("Oso");
System.out.println(dog1.toString());
dog1.greets();
dog1.greets(dog2);
}
}
