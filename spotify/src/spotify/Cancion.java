package spotify;

public class Cancion {
    private String titulo;
    private String artista;
    private int duracion;
    private boolean favorito;
    private boolean descargado;
    
    public Cancion() {
    }

    public Cancion(String titulo, String artista, int duracion, boolean favorito, boolean descargado) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.favorito = favorito;
        this.descargado = descargado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public boolean isDescargado() {
        return descargado;
    }

    public void setDescargado(boolean descargado) {
        this.descargado = descargado;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo= " + titulo + " | artista= " + artista + " | duracion= " + duracion + " | favorito= " + favorito + " | descargado= " + descargado + '}';
    }

}