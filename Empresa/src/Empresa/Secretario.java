package Empresa;

class Secretario extends Empleado {
    private String despacho;
    private String numeroFax;

    public Secretario(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario, String despacho, String numeroFax) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }

    @Override
    public void incrementarSalario(double incremento) {
        super.incrementarSalario(salario * 0.05);
    }

    @Override
    public String toString() {
        return super.toString() + ", Despacho: " + despacho + ", Fax: " + numeroFax;
    }
}