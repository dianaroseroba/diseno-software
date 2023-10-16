package Empresa;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
class Empleado {
    private String nombre;
    private String apellidos;
    private String DNI;
    private String direccion;
    private int antiguedad;
    private String telefono;
    protected double salario;
    private Empleado supervisor;

    public Empleado(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.setDireccion(direccion);
        this.setTelefono(telefono);
        this.salario = salario;
        this.setAntiguedad(0); // Default
        this.setSupervisor(null); // Default
    }

    public void cambiarSupervisor(Empleado supervisor) {
        this.setSupervisor(supervisor);
    }

    public void incrementarSalario(double incremento) {
        this.salario += incremento;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + " " + apellidos + ", DNI: " + DNI + ", Salario: " + salario;
    }

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Empleado getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Empleado supervisor) {
		this.supervisor = supervisor;
	}
}


