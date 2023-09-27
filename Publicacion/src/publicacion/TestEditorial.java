package publicacion;

//Clase de prueba
public class TestEditorial {
public static void main(String[] args) {
java.util.Scanner scanner = new java.util.Scanner(System.in);

System.out.println("Datos del libro:");
System.out.print("Título: ");
String tituloLibro = scanner.nextLine();
System.out.print("Precio: ");
float precioLibro = scanner.nextFloat();
System.out.print("Número de páginas: ");
int numeroPaginas = scanner.nextInt();
System.out.print("Año de publicación: ");
int anoPublicacion = scanner.nextInt();

scanner.nextLine();  // Consumir la línea pendiente

System.out.println("\nDatos del disco:");
System.out.print("Título: ");
String tituloDisco = scanner.nextLine();
System.out.print("Precio: ");
float precioDisco = scanner.nextFloat();
System.out.print("Duración en minutos: ");
float duracion = scanner.nextFloat();

Libro libro = new Libro(tituloLibro, precioLibro, numeroPaginas, anoPublicacion);
Disco disco = new Disco(tituloDisco, precioDisco, duracion);

System.out.println("\nInformación del libro:");
libro.mostrar();

System.out.println("\nInformación del disco:");
disco.mostrar();

scanner.close();
}
}
