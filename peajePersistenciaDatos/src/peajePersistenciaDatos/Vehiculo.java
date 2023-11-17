package peajePersistenciaDatos;

import java.io.Serializable;

class Vehiculo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String placa;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }
}
