package Facultad;

//Clase Persona
class Persona {
 protected String nombre;
 protected String apellidos;
 protected String numeroIdentificacion;
 protected String estadoCivil;

 public Persona(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil) {
     this.nombre = nombre;
     this.apellidos = apellidos;
     this.numeroIdentificacion = numeroIdentificacion;
     this.estadoCivil = estadoCivil;
 }

 public void cambiarEstadoCivil(String nuevoEstadoCivil) {
     this.estadoCivil = nuevoEstadoCivil;
 }

 public String toString() {
     return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", Número ID: " + numeroIdentificacion + ", Estado civil: " + estadoCivil;
 }
}






