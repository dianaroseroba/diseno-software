package examenMomento3;

class EstacionPeaje {
    private String nombre;
    private String departamento;
    private int totalPeajeRecolectado;

    public EstacionPeaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.totalPeajeRecolectado = 0;
    }

    public void registrarPeaje(int peaje) {
        totalPeajeRecolectado += peaje;
    }

    public void imprimirInformacion() {
        System.out.println("Estación de Peaje: " + nombre + " en " + departamento);
        System.out.println("Total de peajes recolectados: $" + totalPeajeRecolectado);
    }

    public static void main(String[] args) {
        EstacionPeaje estacion = new EstacionPeaje("Estacion PastoLindo", "Departamento Nariño");

        Vehiculo[] vehiculos = {
            new Carro("OJO678"),
            new Moto("ASL90P", 150),
            new Camion("LOL123", 4),
            new Moto("TRE76L", 200),
            new Carro("POR345"),
            new Moto("KGJ44B", 250),
            new Camion("LKJ890", 4),
            new Moto("AFG64", 150)
        };

        System.out.println("Vehículos que pasaron por el peaje:");

        for (Vehiculo vehiculo : vehiculos) {
            int peaje = vehiculo.calcularPeaje();
            estacion.registrarPeaje(peaje);

            System.out.println("Placa: " + vehiculo.getPlaca() + ", Peaje: $" + peaje);
        }

        estacion.imprimirInformacion();
    }
}
