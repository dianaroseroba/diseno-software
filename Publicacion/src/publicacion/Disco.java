package publicacion;

//Clase derivada Disco
class Disco extends Publicacion {
private float duracion;

public Disco(String titulo, float precio, float duracion) {
 super(titulo, precio);
 this.duracion = duracion;
}

@Override
public void mostrar() {
 super.mostrar();
 System.out.println("Duración: " + duracion + " minutos");
}
}

