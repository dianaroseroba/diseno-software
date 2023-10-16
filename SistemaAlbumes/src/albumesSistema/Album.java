package albumesSistema;

import java.util.List;

class Album {
    private String titulo;
    private int anoProduccion;
    private String descripcion;
    private List<Artista> artistas;
    private List<Cancion> canciones;
    private MEDIO medio;

    public Album(String titulo, int anoProduccion, String descripcion, List<Artista> artistas, List<Cancion> canciones, MEDIO medio) {
        this.titulo = titulo;
        this.anoProduccion = anoProduccion;
        this.descripcion = descripcion;
        this.artistas = artistas;
        this.canciones = canciones;
        this.medio = medio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoProduccion() {
        return anoProduccion;
    }

    public void setAnoProduccion(int anoProduccion) {
        this.anoProduccion = anoProduccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    public MEDIO getMedio() {
        return medio;
    }

    public void setMedio(MEDIO medio) {
        this.medio = medio;
    }

    public void agregarCancion(Cancion cancion) {
        this.canciones.add(cancion);
    }

    public void eliminarCancion(Cancion cancion) {
        this.canciones.remove(cancion);
    }

    public void editarInformacion(String titulo, int anoProduccion, String descripcion, List<Artista> artistas) {
        this.titulo = titulo;
        this.anoProduccion = anoProduccion;
        this.descripcion = descripcion;
        this.artistas = artistas;
    }
    
  }
