package examenMomento3;

class Carro extends Vehiculo {
    public Carro(String placa) {
        super(placa);
    }

    @Override
    public int calcularPeaje() {
        return 10000; // Valor asignado a carros
    }
}

