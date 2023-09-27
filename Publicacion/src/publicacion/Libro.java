package publicacion;

//Clase derivada Libro
class Libro extends Publicacion {
private int numeroPaginas;
private int anoPublicacion;

public Libro(String titulo, float precio, int numeroPaginas, int anoPublicacion) {
   super(titulo, precio);
   this.numeroPaginas = numeroPaginas;
   this.anoPublicacion = anoPublicacion;
}

@Override
public void mostrar() {
   super.mostrar();
   System.out.println("Número de páginas: " + numeroPaginas);
   System.out.println("Año de publicación: " + anoPublicacion);
}
}

