package biblioteca;

//Clase de prueba
public class Prueba {
 public static void main(String[] args) {
     Libro libro1 = new Libro("L01", "El retrato de Dorian Gray", 1605);
     Revista revista1 = new Revista("R01", "El jaguar dorado y la tierra e las cordilleras", 2019, 1002);

     System.out.println(libro1);
     System.out.println(revista1);

     libro1.prestar();
     System.out.println(libro1);

     libro1.devolver();
     System.out.println(libro1);
 }
}