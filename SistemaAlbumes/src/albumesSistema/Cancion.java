package albumesSistema;

import java.util.List;

class Cancion {
    private String titulo;
    private String duracion;
    private List<Artista> interpretes;
    private Artista compositor;

    public Cancion(String titulo, String duracion, List<Artista> interpretes, Artista compositor) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.interpretes = interpretes;
        this.compositor = compositor;
    }


	public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public List<Artista> getInterpretes() {
        return interpretes;
    }

    public void setInterpretes(List<Artista> interpretes) {
        this.interpretes = interpretes;
    }

    public Artista getCompositor() {
        return compositor;
    }

    public void setCompositor(Artista compositor) {
        this.compositor = compositor;
    }

    public void editarInformacion(String titulo, String duracion, List<Artista> interpretes) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.interpretes = interpretes;
    }
}
