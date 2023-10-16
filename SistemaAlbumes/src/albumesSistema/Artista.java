package albumesSistema;

import java.util.List;

@SuppressWarnings("unused")
enum MEDIO {
    DISCOS, CASETES, CDS;
}

class Artista {
    private String nombre;

    public Artista(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}