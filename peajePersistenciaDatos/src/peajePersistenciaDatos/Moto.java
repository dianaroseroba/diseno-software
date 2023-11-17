package peajePersistenciaDatos;

class Moto extends Vehiculo {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cilindraje;

    public Moto(String placa, int cilindraje) {
        super(placa);
        this.cilindraje = cilindraje;
    }

    public int calcularPeaje() {
        return (cilindraje > 200) ? 7000 : 5000;
    }
}
