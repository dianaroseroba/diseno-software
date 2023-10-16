package Facultad;

//Clase PersonalServicio
class PersonalServicio extends Empleado {
private String seccion;

public PersonalServicio(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil, int anoIncorporacion, String numeroDespacho, String seccion) {
   super(nombre, apellidos, numeroIdentificacion, estadoCivil, anoIncorporacion, numeroDespacho);
   this.seccion = seccion;
}

public void trasladarSeccion(String nuevaSeccion) {
   this.seccion = nuevaSeccion;
}

@Override
public String toString() {
   return super.toString() + ", Sección: " + seccion;
}
}
