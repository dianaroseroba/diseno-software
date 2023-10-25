package vehiculo;

public class Auto implements IVehiculo{
	
	private int cantidadGalones;
	public Auto(int cantidadGalones) {
		this.setcantidadGalones(cantidadGalones);
	}

	private void setcantidadGalones(int cantidadGalones2) {
		// TODO Auto-generated method stub
		
	}

	public Auto() {
		// TODO Auto-generated constructor stub
	}

	public int getCantidadGalones() {
		return cantidadGalones;
	}

	public void setCantidadGalones(int cantidadGalones) {
		this.cantidadGalones = cantidadGalones;
	}

	@Override
	public void conducir() {
		// TODO Auto-generated method stub
		System.out.println("El carro está en movimiento");
		this.cantidadGalones--; 
	}

	@Override
	public boolean retanquear(int cantidad) {
		if(cantidad+this.cantidadGalones>0 && cantidad+this.cantidadGalones<21)
		{
			this.cantidadGalones+=cantidad;
			return true;
		}
		else {
			return false;
		}
	}

}
