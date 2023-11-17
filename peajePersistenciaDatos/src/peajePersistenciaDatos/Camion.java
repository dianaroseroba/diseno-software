package peajePersistenciaDatos;

class Camion extends Vehiculo {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numeroEjes;

    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    public int calcularPeaje() {
        return 5000 * numeroEjes;
    }
}
