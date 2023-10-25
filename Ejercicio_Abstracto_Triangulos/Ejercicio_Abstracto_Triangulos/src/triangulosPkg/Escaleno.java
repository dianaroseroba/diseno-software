package triangulosPkg;

public class Escaleno extends TrianguloBase {
    public Escaleno(int lado1, int lado2, int lado3, int hipotenusa) {
        super(lado1, lado2, lado3, hipotenusa);
    }

    @Override
    public double perimetro() {
        // El perímetro de un triángulo escaleno es la suma de sus lados
        return getLado1() + getLado2() + getLado3();
    }

    @Override
    public double calcularAreaConHipotenusa(int lado, int hipotenusa) {
        System.out.println("Los triángulos escalenos no tienen hipotenusa.");
        return 0;
    }

    // Método para calcular el área de un triángulo escaleno usando la fórmula de Herón.
    public double calcularAreaEscaleno() {
        double a = getLado1();
        double b = getLado2();
        double c = getLado3();
        double s = perimetro() / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
}
