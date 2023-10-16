package Triangulos;

//4. Programa principal
public class Triangulos {
public static void main(String[] args) {
   // Instanciamos un triángulo Escaleno
   Escaleno escaleno = new Escaleno(2, 5, 8);
   System.out.println("Perímetro del triángulo Escaleno: " + escaleno.Perimetro());
   System.out.println("Área del triángulo Escaleno con hipotenusa: " + escaleno.CalcularAreaconHipotenusa(3, 5));

   // Instanciamos un triángulo Acutángulo
   Acutangulo acutangulo = new Acutangulo(1, 9, 15);
   System.out.println("Perímetro del triángulo Acutángulo: " + acutangulo.Perimetro());
   System.out.println("Área del triángulo Acutángulo con hipotenusa: " + acutangulo.CalcularAreaconHipotenusa(6, 10));
}
}
