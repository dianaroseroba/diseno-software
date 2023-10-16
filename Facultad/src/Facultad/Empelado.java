package Facultad;

//Clase Empleado
abstract class Empleado extends Persona {
protected int anoIncorporacion;
protected String numeroDespacho;

public Empleado(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil, int anoIncorporacion, String numeroDespacho) {
   super(nombre, apellidos, numeroIdentificacion, estadoCivil);
   this.anoIncorporacion = anoIncorporacion;
   this.numeroDespacho = numeroDespacho;
}

public void reasignarDespacho(String nuevoDespacho) {
   this.numeroDespacho = nuevoDespacho;
}
}