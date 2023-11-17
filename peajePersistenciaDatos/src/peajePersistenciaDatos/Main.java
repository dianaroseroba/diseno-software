package peajePersistenciaDatos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EstacionDePeaje estacion;

        // Cargar registros existentes si hay alguno
        estacion = EstacionDePeaje.cargarRegistros("registros.dat");

        if (estacion == null) {
            // Si no hay registros existentes, crear una nueva estación de peaje
            estacion = new EstacionDePeaje("Estacion1", "Departamento1");
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el tipo de vehículo (carro, moto, camion) o 'fin' para salir:");
            String tipoVehiculo = scanner.nextLine();

            if (tipoVehiculo.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Ingrese la placa del vehículo: ");
            String placa = scanner.nextLine();

            if (tipoVehiculo.equalsIgnoreCase("carro")) {
                Carro carro = new Carro(placa);
                estacion.cobrarPeaje(carro);
            } else if (tipoVehiculo.equalsIgnoreCase("moto")) {
                System.out.print("Ingrese el cilindraje de la moto: ");
                int cilindraje = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                Moto moto = new Moto(placa, cilindraje);
                estacion.cobrarPeaje(moto);
            } else if (tipoVehiculo.equalsIgnoreCase("camion")) {
                System.out.print("Ingrese el número de ejes del camión: ");
                int numeroEjes = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                Camion camion = new Camion(placa, numeroEjes);
                estacion.cobrarPeaje(camion);
            } else {
                System.out.println("Tipo de vehículo no válido");
            }
        }

        scanner.close();

        // Mostrar registros y total recolectado
        estacion.mostrarRegistros();

        // Guardar registros en un archivo
        estacion.guardarRegistros("registros.dat");
    }
}