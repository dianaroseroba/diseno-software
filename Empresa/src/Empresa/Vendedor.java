package Empresa;

import java.util.ArrayList;
import java.util.List;

class Vendedor extends Empleado {
    private String matricula;
    private String marca;
    private String modelo;
    private String telefonoMovil;
    private String areaVenta;
    private List<String> listaClientes = new ArrayList<>();
    private double comisiones;

    public Vendedor(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario, String matricula, String marca, String modelo, String telefonoMovil, String areaVenta, double comisiones) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.setTelefonoMovil(telefonoMovil);
        this.setAreaVenta(areaVenta);
        this.setComisiones(comisiones);
    }

    public void altaCliente(String cliente) {
        listaClientes.add(cliente);
    }

    public void bajaCliente(String cliente) {
        listaClientes.remove(cliente);
    }

    public void cambiarCoche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void incrementarSalario(double incremento) {
        super.incrementarSalario(salario * 0.10);
    }

    @Override
    public String toString() {
        return super.toString() + ", Coche: " + marca + " " + modelo + " (" + matricula + ")";
    }

	public String getTelefonoMovil() {
		return telefonoMovil;
	}

	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	public String getAreaVenta() {
		return areaVenta;
	}

	public void setAreaVenta(String areaVenta) {
		this.areaVenta = areaVenta;
	}

	public double getComisiones() {
		return comisiones;
	}

	public void setComisiones(double comisiones) {
		this.comisiones = comisiones;
	}
}
