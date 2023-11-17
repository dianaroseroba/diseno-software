package biblioteca;

//Definimos la clase padre Publicacion
abstract class Publicacion {
	private String codigo;
	protected String titulo;
	private int anoPublicacion;
	
	public Publicacion(String codigo, String titulo, int anoPublicacion) {
	  
		   this.codigo = codigo;
		   this.titulo = titulo;
		   this.anoPublicacion = anoPublicacion;
		}
	
	public String getCodigo() {
		   return codigo;
		}
	
	public int getAnoPublicacion() {
		   return anoPublicacion;
		}
	@Override
	public abstract String toString();
	}







