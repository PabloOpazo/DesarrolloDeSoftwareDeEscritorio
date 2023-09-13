package spotify.pkg2;

public class Cancion {
    private String titulo, artista;
    private int min, seg;
    private boolean favoritos, descarga;
    private Playlist playlist;

    public Cancion() {
        this.playlist = new Playlist();
    }

    public Cancion(String titulo, String artista, int min, int seg, boolean favoritos, boolean descarga, Playlist playlist) {
        this.setTitulo(titulo);
        this.setArtista(artista);
        this.setMin(min);
        this.setSeg(seg);
        this.setFavoritos(favoritos);
        this.setDescarga(descarga);
        this.setPlaylist(playlist);
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

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }
    
    public String duracion() {
        String duracion = getMin() + ":" + String.format("%02d", getSeg());
        return duracion;
    }

    public boolean isFavoritos() {
        return favoritos;
    }

    public void setFavoritos(boolean favoritos) {
        this.favoritos = favoritos;
    }

    public boolean isDescarga() {
        return descarga;
    }

    public void setDescarga(boolean descarga) {
        this.descarga = descarga;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + ", min=" + min + ", seg=" + seg + ", favoritos=" + favoritos + ", descarga=" + descarga + ", playlist=" + playlist + '}';
    }

    
}
