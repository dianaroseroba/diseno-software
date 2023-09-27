package circulo;

import java.util.Scanner;

//Clase derivada CilindroHueco
class CilindroHueco extends Cilindro {
private double radioInterno;

public void leerRadioInterno() {
 @SuppressWarnings("resource")
Scanner scanner = new Scanner(System.in);
 System.out.print("Ingrese el radio interno del cilindro hueco: ");
 radioInterno = scanner.nextDouble();
}

@Override
public double calcularArea() {
 return (2 * Math.PI * (radio * radio - radioInterno * radioInterno)) + (2 * Math.PI * radio * altura) + (2 * Math.PI * altura * radioInterno);
}

public double calcularVolumenHueco() {
 return Math.PI * (radio * radio - radioInterno * radioInterno) * altura;
}
}

