package ejercicioGatoPkg;

public class ejercicioGato {
	public ejercicioGato() {
		
	}
	
	public static void main(String[]args) {
		Gato miGato=new Gato();
		miGato.setNombre("Tomas");
		
		miGato.maullar();
		miGato.dormir(2);
		miGato.correr("el parque");
		miGato.comer("raton");
		
		System.out.println("El nombre de mi gato es: " + miGato.getNombre());
		
	}
}