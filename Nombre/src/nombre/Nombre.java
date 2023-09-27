package nombre;

import java.util.Scanner;

//Clase base Nombre
class Nombre {
 protected String nombre;
 protected String primerApellido;
 protected String segundoApellido;

 public Nombre() {}

 public Nombre(String nombre, String primerApellido, String segundoApellido) {
     this.nombre = nombre;
     this.primerApellido = primerApellido;
     this.segundoApellido = segundoApellido;
 }

 public void leerNombre() {
     @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
     System.out.print("Ingrese nombre: ");
     nombre = scanner.nextLine();
     System.out.print("Ingrese primer apellido: ");
     primerApellido = scanner.nextLine();
     System.out.print("Ingrese segundo apellido: ");
     segundoApellido = scanner.nextLine();
 }

 public void mostrar() {
     System.out.println("Nombre completo: " + nombre + " " + primerApellido + " " + segundoApellido);
 }
}

