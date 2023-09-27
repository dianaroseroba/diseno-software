package person;

//Main class to test the classes
public class Test {
public static void main(String[] args) {
 Student student = new Student("Diana", "273 Obonuco", "Software Engineer", 2023, 3780000);
 System.out.println(student.toString());

 Staff staff = new Staff("Ana", "calle 19b", "Udenar", 700000);
 System.out.println(staff.toString());
}
}
