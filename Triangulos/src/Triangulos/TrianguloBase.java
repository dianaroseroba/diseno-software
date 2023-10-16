package Triangulos;

//1. Clase abstracta TrianguloBase
abstract class TrianguloBase {
 // Método abstracto para calcular el perímetro
 public abstract double Perimetro();

 // Método para calcular el área usando la hipotenusa
 public double CalcularAreaconHipotenusa(int lado, int hipotenusa) {
     // Usando la fórmula de área de un triángulo: (base * altura) / 2
     // En este caso, usamos la hipotenusa como altura
     return (lado * hipotenusa) / 2.0;
 }
}




