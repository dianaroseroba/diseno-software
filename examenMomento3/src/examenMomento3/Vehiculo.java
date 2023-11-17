package examenMomento3;

abstract class Vehiculo {
    protected String placa;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

	public abstract int calcularPeaje();
    
    public String getPlaca() {
        return placa;
    }
}

