package Empresa;

import java.util.ArrayList;
import java.util.List;

class JefeDeZona extends Vendedor {
    private String despacho;
    private Secretario secretario;
    private List<Vendedor> vendedores = new ArrayList<>();

    public JefeDeZona(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario, String matricula, String marca, String modelo, String telefonoMovil, String areaVenta, double comisiones, String despacho) {
        super(nombre, apellidos, DNI, direccion, telefono, salario, matricula, marca, modelo, telefonoMovil, areaVenta, comisiones);
        this.despacho = despacho;
    }

    public void cambiarSecretario(Secretario secretario) {
        this.setSecretario(secretario);
    }

    public void altaVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void bajaVendedor(Vendedor vendedor) {
        vendedores.remove(vendedor);
    }

    @Override
    public void incrementarSalario(double incremento) {
        super.incrementarSalario(salario * 0.20);
    }

    @Override
    public String toString() {
        return super.toString() + ", Despacho: " + despacho;
    }

	public Secretario getSecretario() {
		return secretario;
	}

	public void setSecretario(Secretario secretario) {
		this.secretario = secretario;
	}
}
