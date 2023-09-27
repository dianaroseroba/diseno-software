package circulo;

import java.util.Scanner;

//Clase base Circulo
class Circulo {
 protected double radio;

 public void leerRadio() {
     @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
     System.out.print("Ingrese el radio del círculo: ");
     radio = scanner.nextDouble();
 }

 public double calcularArea() {
     return Math.PI * radio * radio;
 }

 public double calcularCircunferencia() {
     return 2 * Math.PI * radio;
 }
}

