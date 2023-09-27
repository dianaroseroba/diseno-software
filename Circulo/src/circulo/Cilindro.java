package circulo;

import java.util.Scanner;

//Clase derivada Cilindro
class Cilindro extends Circulo {
protected double altura;

public void leerAltura() {
   @SuppressWarnings("resource")
Scanner scanner = new Scanner(System.in);
   System.out.print("Ingrese la altura del cilindro: ");
   altura = scanner.nextDouble();
}

public double calcularArea() {
   return (2 * Math.PI * radio * altura) + (2 * Math.PI * radio * radio);
}

public double calcularVolumen() {
   return Math.PI * radio * radio * altura;
}
}
