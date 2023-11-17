package examenMomento3;

class Camion extends Vehiculo {
    private int numeroEjes;

    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    @Override
    public int calcularPeaje() {
        return 5000 * numeroEjes;
    }
}
