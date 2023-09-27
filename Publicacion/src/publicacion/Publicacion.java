package publicacion;

//Clase base Publicación
class Publicacion {
 protected String titulo;
 protected float precio;

 public Publicacion(String titulo, float precio) {
     this.titulo = titulo;
     this.precio = precio;
 }

 public void mostrar() {
     System.out.println("Título: " + titulo);
     System.out.println("Precio: " + precio);
 }
}

