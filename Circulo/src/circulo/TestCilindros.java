package circulo;

//Clase principal para probar las clases
public class TestCilindros {
public static void main(String[] args) {
Circulo circulo = new Circulo();
circulo.leerRadio();
System.out.println("Área del círculo: " + circulo.calcularArea());
System.out.println("Circunferencia del círculo: " + circulo.calcularCircunferencia());

Cilindro cilindro = new Cilindro();
cilindro.leerRadio();
cilindro.leerAltura();
System.out.println("Área del cilindro: " + cilindro.calcularArea());
System.out.println("Volumen del cilindro: " + cilindro.calcularVolumen());

CilindroHueco cilindroHueco = new CilindroHueco();
cilindroHueco.leerRadio();
cilindroHueco.leerAltura();
cilindroHueco.leerRadioInterno();
System.out.println("Área del cilindro hueco: " + cilindroHueco.calcularArea());
System.out.println("Volumen del cilindro hueco: " + cilindroHueco.calcularVolumenHueco());
}
}
