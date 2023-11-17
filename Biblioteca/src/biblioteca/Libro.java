package biblioteca;

class Libro extends Publicacion implements Prestable {
    private boolean estaPrestado;

    public Libro(String codigo, String titulo, int anoPublicacion) {
        super(codigo, titulo, anoPublicacion);
        this.estaPrestado = false;
    }

    @Override
    public void prestar() {
        this.estaPrestado = true;
    }

    @Override
    public void devolver() {
        this.estaPrestado = false;
    }

    @Override
    public boolean prestado() {
        return estaPrestado;
    }

    @Override
    public String toString() {
        return "Libro: Código = " + getCodigo() + ", Título = " + titulo + ", Año de Publicación = " + getAnoPublicacion() + ", Está Prestado = " + estaPrestado;
    }
}

