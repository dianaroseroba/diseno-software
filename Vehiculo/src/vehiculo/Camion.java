package vehiculo;

//Subclase Camion
class Camion extends Vehiculo {
private Remolque remolque;

public Camion(String matricula) {
   super(matricula);
   this.remolque = null;
}

public void ponRemolque(Remolque remolque) {
   this.remolque = remolque;
}

public void quitaRemolque() {
   this.remolque = null;
}

@Override
public void acelerar(int incremento) {
   if (remolque != null && (velocidad + incremento) > 100) {
       System.out.println("¡Vas demasiado rápido para llevar un remolque!");
       return;
   }
   super.acelerar(incremento);
}

@Override
public String toString() {
   if (remolque != null) {
       return super.toString() + ", " + remolque.toString();
   }
   return super.toString();
}
}