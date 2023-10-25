package triangulosPkg;

public class Acutangulo extends TrianguloBase {
    public Acutangulo(int lado1, int lado2, int lado3, int hipotenusa) {
        super(lado1, lado2, lado3, hipotenusa);
    }

    @Override
    public double perimetro() {
        // El perímetro de un triángulo acutángulo es la suma de sus lados
        return getLado1() + getLado2() + getLado3();
    }

    @Override
    public double calcularAreaConHipotenusa(int lado, int hipotenusa) {
        System.out.println("Los triángulos acutángulos no tienen hipotenusa.");
        return 0;
    }

    // Método para calcular el área de un triángulo acutángulo usando la fórmula de Herón.
    public double calcularAreaAcutangulo() {
        double a = getLado1();
        double b = getLado2();
        double c = getLado3();
        double s = perimetro() / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
}
