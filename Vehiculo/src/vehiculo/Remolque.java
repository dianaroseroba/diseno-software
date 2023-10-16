package vehiculo;

//Clase Remolque
class Remolque {
private int peso;

public Remolque(int peso) {
   this.peso = peso;
}

@Override
public String toString() {
   return "Peso del remolque: " + peso + " kg";
}
}