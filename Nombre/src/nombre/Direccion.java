package nombre;

import java.util.Scanner;

//Clase derivada Direccion
class Direccion extends Nombre {
private String direccion;
private String codigoPostal;

public Direccion() {}

public void nuevaDireccion() {
   Scanner scanner = new Scanner(System.in);
   System.out.print("Ingrese dirección: ");
   direccion = scanner.nextLine();
   System.out.print("Ingrese código postal: ");
   codigoPostal = scanner.nextLine();
}

public void nuevoNombre() {
   leerNombre();
}

@Override
public void mostrar() {
   super.mostrar();
   System.out.println("Dirección: " + direccion);
   System.out.println("Código Postal: " + codigoPostal);
}
}

