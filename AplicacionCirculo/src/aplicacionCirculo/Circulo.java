package aplicacionCirculo;

public class Circulo {
	
	private double radio; //**definiendo mi atributo radio - antes del constructor
	

	public Circulo() {
		// TODO Auto-generated constructor stub
		radio=1.0; //**valor inicial despues de mi constructor - aqui inician los metodos
	}
	
	public Circulo (double radio) {
		this.radio=radio; //**el operador this me sirve para referirme al elemento de la clase
	}

	public double getRadio() { //se generan en source en setter and getters
		return radio; //forma de que acceda al elemento privado radio - return devuelve el atributo radio
	}

	public void setRadio(double radio) {
		this.radio = radio; //que valor le pongo al radio - un aprametro que es doble - radio de mi clase es igual al radio que me va a enviar - set asignar radio
	}
	
	public double getArea() {
		double miArea=Math.PI*Math.pow(this.radio,2) ; //Math pow es operacion potencia y recibe el dato y el numero al que lo voy a potenciar - siempre se usa this para que sea el valor de radio y no el de la clase
		return miArea; //operacion get area completada 
	}
	
	public double getCircunferencia( ) {
		double circunferencia=2*this.radio;
		return circunferencia;
	}

	@Override //anotacion - se obtiene funcion tostring desde source en tostring y tomo dato radio
	public String toString() {
		return "mi Circulo tiene un radio de " + radio +" gracias.";
	}

	
}
