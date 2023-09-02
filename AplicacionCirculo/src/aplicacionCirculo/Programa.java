/** 
 * esta es mi aplicacion para circulos
 */
package aplicacionCirculo;
import java.util.Scanner; 

/**
 * este es el progarma principal
 */
public class Programa {

	/**
	 * este es el constructor de la clase
	 */
	public Programa() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * este es el punto de entrada del programa
	 * aqui se ejecuta mi constructor circulo - primera operaicon 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner teclado = new Scanner(System.in)) {
			Circulo miCirculo=new Circulo();
			System.out.println("ingrese el radio del circulo");
			miCirculo.setRadio(teclado.nextDouble());
			
			System.out.println(miCirculo.getArea()); 
			System.out.println(miCirculo); //llama a mi toString y va a usar lo que pusimos en circulo
		}

	}

}
