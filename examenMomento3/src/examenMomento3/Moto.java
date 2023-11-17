package examenMomento3;

public class Moto extends Vehiculo {
    private int cilindraje;

    public Moto(String placa, int cilindraje) {
        super(placa);
        this.cilindraje = cilindraje;
    }

    @Override
    public int calcularPeaje() {
        if (cilindraje < 200) {
            return 5000;
        } else {
            return 7000;
        }
    }
}
