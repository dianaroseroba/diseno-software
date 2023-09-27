package fabricacionCarros;

public class mainFabricacionCarros {
    public static void main(String[] args) {
        Planta planta1 = new Planta("Grande", "Deportiva", 1000.0, "Aluminio", new String[]{"Rojo", "Azul"});
        Planta planta2 = new Planta("Mediana", "Clásica", 1500.0, "Acero", new String[]{"Negro", "Blanco"});

        for (int i = 0; i < 100; i++) {
            System.out.println("Planta 1, Carro " + (i + 1) + ": " + planta1.fabricacionCarros().getDetalles());
            System.out.println("Planta 2, Carro " + (i + 1) + ": " + planta2.fabricarCarro().getDetalles());
        }
    }
}
