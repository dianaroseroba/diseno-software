package vehiculo;

//Clase principal para probar el código
public class SimuladorVehiculos {
public static void main(String[] args) {
   Coche coche = new Coche("ABC-123", 4);
   System.out.println(coche);

   Camion camion = new Camion("DEF-456");
   System.out.println(camion);

   Remolque remolque = new Remolque(1200);
   camion.ponRemolque(remolque);
   System.out.println(camion);

   camion.acelerar(105); // Debería mostrar un mensaje de advertencia

   camion.acelerar(80); 
   System.out.println(camion);
}
}
