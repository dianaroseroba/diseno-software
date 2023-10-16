package albumesSistema;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creando algunos artistas
        Artista artista1 = new Artista("Jorja Smith");
        Artista artista2 = new Artista("Project");
        Artista artista3 = new Artista("Selena Gomez");
        Artista artista4 = new Artista("Sabrina Carpenter");
        Artista artista5 = new Artista("Luis Alfonso");
        Artista artista6 = new Artista("Doble porcion");
        Artista artista7 = new Artista("Alkolirykoz");
        Artista artista8 = new Artista("Nach");
        Artista artista9 = new Artista("TresCornonas");
        Artista compositor1 = new Artista("Charls");
        Artista compositor2 = new Artista("Nanpa");
        Artista compositor3 = new Artista("Alka");

        // Creando y configurando canciones
        Cancion cancion1 = new Cancion("Come Over", "03:00", List.of(artista1, artista2), compositor1);
        Cancion cancion2 = new Cancion("Listen up", "02:00", List.of(artista3, artista4), compositor3);
        Cancion cancion3 = new Cancion("Blessing", "04:00", List.of(artista5, artista7), compositor1);
        Cancion cancion4 = new Cancion("we dont talk", "03:50", List.of(artista9, artista6), compositor1);
        Cancion cancion5 = new Cancion("Baila", "03:30", List.of(artista1, artista5), compositor1);

        // Imprimiendo información de las canciones
        imprimirInformacion(cancion1);
        imprimirInformacion(cancion2);
        imprimirInformacion(cancion3);
        imprimirInformacion(cancion4);
        imprimirInformacion(cancion5);
        
        // Editando la información de la canción
        cancion1.editarInformacion("Come Over Edicion", "02:30", List.of(artista1));
        System.out.println("\nInformación de la canción después de editar:");
        imprimirInformacion(cancion1);

        // Borrando la canción de la lista
        List<Cancion> listaDeCanciones = new ArrayList<>();
        listaDeCanciones.add(cancion1);
        borrarCancion(listaDeCanciones, cancion4);
        System.out.println("\nLista de canciones después de borrar:");
        for (Cancion cancion : listaDeCanciones) {
            System.out.println(" - " + cancion.getTitulo());
        }
    }

    public static void imprimirInformacion(Cancion cancion) {
        System.out.println("Título de la canción: " + cancion.getTitulo());
        System.out.println("Duración: " + cancion.getDuracion());
        System.out.println("Compositor: " + cancion.getCompositor().getNombre());
        System.out.println("Intérpretes: ");
        for (Artista interprete : cancion.getInterpretes()) {
            System.out.println(" - " + interprete.getNombre());
        }
    }

    public static void borrarCancion(List<Cancion> listaDeCanciones, Cancion cancionABorrar) {
        listaDeCanciones.remove(cancionABorrar);
    }
}
