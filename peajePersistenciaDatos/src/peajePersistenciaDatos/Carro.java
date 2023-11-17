package peajePersistenciaDatos;

class Carro extends Vehiculo {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Carro(String placa) {
        super(placa);
    }

    public int calcularPeaje() {
        return 10000;
    }
}