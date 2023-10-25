package biblioteca;

//Definimos la clase Revista que hereda de Publicacion
class Revista extends Publicacion {
	private int numero;
	public Revista(String codigo, String titulo, int anoPublicacion, int numero) {
		 super(codigo, titulo, anoPublicacion);
		 this.numero = numero;
		}
	@Override
	public String toString() {
	    return "Revista: Código = " + getCodigo() + ", Título = " + getTitulo() + ", Año de Publicación = " + getAnoPublicacion() + ", Número = " + numero;
	}
	private String getTitulo() {
		// TODO Auto-generated method stub
		return null;
	}

}




