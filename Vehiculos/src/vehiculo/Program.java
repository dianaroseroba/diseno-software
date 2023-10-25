package vehiculo;

public class Program {

	public Program() {
		// TODO Auto-generated constructor stub
	}
	public static void main (String[]args) {
		
		Auto miauto=new Auto();
		System.out.println("El auto tiene" + miauto.getCantidadGalones()+ "galones");
		
		miauto.retanquear(5);
		System.out.println("El auto tiene" + miauto.getCantidadGalones()+ "galones");
		
		miauto.conducir();
		System.out.println("El auto tiene" + miauto.getCantidadGalones()+ "galones");
		
		miauto.retanquear(10);
		System.out.println("El auto tiene" + miauto.getCantidadGalones()+ "galones");
		
		miauto.conducir();
		System.out.println("El auto tiene" + miauto.getCantidadGalones()+ "galones");
	}

}
