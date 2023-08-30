package spotify;

public class Cancion {
    private String nombre, artista;
    private int minutos, segundos, duracion, descarga, favoritos;

    //Constructor vacío
    public Cancion() {
    }

    public Cancion(String nombre, String artista, int minutos, int segundos, int duracion, int descarga, int favoritos) {
        this.nombre = nombre;
        this.artista = artista;
        this.minutos = minutos;
        this.segundos = segundos;
        this.duracion = duracion;
        this.descarga = descarga;
        this.favoritos = favoritos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getDescarga() {
        return descarga;
    }

    public void setDescarga(int descarga) {
        this.descarga = descarga;
    }

    public int getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(int favoritos) {
        this.favoritos = favoritos;
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", artista=" + artista + ", duracion=" + minutos + ":" + segundos + " min, duracion=" + duracion + ", descarga=" + descarga + ", favoritos=" + favoritos + '}';
    }
    
}
