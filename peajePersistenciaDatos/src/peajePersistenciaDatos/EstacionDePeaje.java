package peajePersistenciaDatos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class EstacionDePeaje implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String departamento;
    private int valorTotalPeaje;
    private List<Vehiculo> vehiculos;

    public EstacionDePeaje(String nombre, String departamento) {
        this.setNombre(nombre);
        this.setDepartamento(departamento);
        this.valorTotalPeaje = 0;
        this.vehiculos = new ArrayList<>();
    }

    public void cobrarPeaje(Vehiculo vehiculo) {
        int peaje = 0;

        if (vehiculo instanceof Carro) {
            peaje = ((Carro) vehiculo).calcularPeaje();
        } else if (vehiculo instanceof Moto) {
            peaje = ((Moto) vehiculo).calcularPeaje();
        } else if (vehiculo instanceof Camion) {
            peaje = ((Camion) vehiculo).calcularPeaje();
        }

        valorTotalPeaje += peaje;
        vehiculos.add(vehiculo);
    }

    public void mostrarRegistros() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Vehículo con placa " + vehiculo.getPlaca() + " - Peaje: $" + calcularPeaje(vehiculo));
        }
        System.out.println("Total de peajes recolectados: $" + valorTotalPeaje);
    }

    private int calcularPeaje(Vehiculo vehiculo) {
        if (vehiculo instanceof Carro) {
            return ((Carro) vehiculo).calcularPeaje();
        } else if (vehiculo instanceof Moto) {
            return ((Moto) vehiculo).calcularPeaje();
        } else if (vehiculo instanceof Camion) {
            return ((Camion) vehiculo).calcularPeaje();
        } else {
            return 0;
        }
    }

    public void guardarRegistros(String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static EstacionDePeaje cargarRegistros(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (EstacionDePeaje) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}