package triangulosPkg;

public class Main {
    public static void main(String[] args) {
        // Instancia triángulo escaleno
        Escaleno escaleno = new Escaleno(5, 6, 7, 0);
        double perimetroEscaleno = escaleno.perimetro();
        double areaEscaleno = escaleno.calcularAreaConHipotenusa(escaleno.getLado1(), escaleno.getHipotenusa());
        double areaEscalenoReal = escaleno.calcularAreaEscaleno();

        System.out.println("Triángulo Escaleno:");
        System.out.println("Perímetro: " + perimetroEscaleno);
        System.out.println("Área hipotenusa: " + areaEscaleno);
        System.out.println("Área Real" + areaEscalenoReal);

        // Instancia triángulo acutángulo
        Acutangulo acutangulo = new Acutangulo(3, 4, 5, 0);
        double perimetroAcutangulo = acutangulo.perimetro();
        double areaAcutangulo = acutangulo.calcularAreaConHipotenusa(acutangulo.getLado1(), acutangulo.getHipotenusa());
        double areaAcutanguloReal = acutangulo.calcularAreaAcutangulo();


        System.out.println("\nTriángulo Acutángulo:");
        System.out.println("Perímetro: " + perimetroAcutangulo);
        System.out.println("Área con Hipotenusa: " + areaAcutangulo);
        System.out.println("Área Real: " + areaAcutanguloReal);
    }
}
